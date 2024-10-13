package com.woowla.compose.icon.collections.boxicons.boxicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.boxicons.boxicons.RegularGroup

public val RegularGroup.BxBarChart: ImageVector
    get() {
        if (_bxBarChart != null) {
            return _bxBarChart!!
        }
        _bxBarChart = Builder(name = "BxBarChart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(14.0f)
                lineTo(9.0f, 20.0f)
                close()
                moveTo(13.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(17.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(5.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(8.0f)
                lineTo(5.0f, 20.0f)
                close()
            }
        }
        .build()
        return _bxBarChart!!
    }

private var _bxBarChart: ImageVector? = null
