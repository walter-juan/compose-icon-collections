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

public val RegularGroup.BxEqualizer: ImageVector
    get() {
        if (_bxEqualizer != null) {
            return _bxEqualizer!!
        }
        _bxEqualizer = Builder(name = "BxEqualizer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(15.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(7.0f, 4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(16.0f)
                lineTo(7.0f, 20.0f)
                close()
                moveTo(19.0f, 11.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(3.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(4.0f)
                lineTo(3.0f, 14.0f)
                close()
            }
        }
        .build()
        return _bxEqualizer!!
    }

private var _bxEqualizer: ImageVector? = null
