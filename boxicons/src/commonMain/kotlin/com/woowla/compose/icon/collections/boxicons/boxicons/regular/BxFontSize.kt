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

public val RegularGroup.BxFontSize: ImageVector
    get() {
        if (_bxFontSize != null) {
            return _bxFontSize!!
        }
        _bxFontSize = Builder(name = "BxFontSize", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(22.0f, 6.0f)
                lineToRelative(-3.0f, -4.0f)
                lineToRelative(-3.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-2.0f)
                lineToRelative(3.0f, 4.0f)
                lineToRelative(3.0f, -4.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(20.0f, 6.0f)
                close()
                moveTo(9.307f, 4.0f)
                lineToRelative(-6.0f, 16.0f)
                horizontalLineToRelative(2.137f)
                lineToRelative(1.875f, -5.0f)
                horizontalLineToRelative(6.363f)
                lineToRelative(1.875f, 5.0f)
                horizontalLineToRelative(2.137f)
                lineToRelative(-6.0f, -16.0f)
                lineTo(9.307f, 4.0f)
                close()
                moveTo(8.068f, 13.0f)
                lineTo(10.5f, 6.515f)
                lineTo(12.932f, 13.0f)
                lineTo(8.068f, 13.0f)
                close()
            }
        }
        .build()
        return _bxFontSize!!
    }

private var _bxFontSize: ImageVector? = null
