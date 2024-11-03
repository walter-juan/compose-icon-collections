package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.SuitcaseFill: ImageVector
    get() {
        if (_suitcaseFill != null) {
            return _suitcaseFill!!
        }
        _suitcaseFill = Builder(name = "SuitcaseFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(3.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.5f, 0.5f)
                lineTo(10.0f, 3.0f)
                horizontalLineToRelative(1.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.0f, 4.5f)
                verticalLineToRelative(9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.004f, 1.416f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 10.0f, 15.0f)
                lineTo(6.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.997f, -0.084f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.0f, 13.5f)
                verticalLineToRelative(-9.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 3.0f)
                lineTo(6.0f, 3.0f)
                close()
                moveTo(9.0f, 1.0f)
                lineTo(7.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(6.0f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                close()
                moveTo(8.5f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                close()
                moveTo(11.0f, 5.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -1.0f, 0.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 1.0f, 0.0f)
                close()
            }
        }
        .build()
        return _suitcaseFill!!
    }

private var _suitcaseFill: ImageVector? = null
