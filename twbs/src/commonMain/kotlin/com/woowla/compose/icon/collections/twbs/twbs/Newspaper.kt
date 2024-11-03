package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Newspaper: ImageVector
    get() {
        if (_newspaper != null) {
            return _newspaper!!
        }
        _newspaper = Builder(name = "Newspaper", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 2.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 1.5f, 1.0f)
                horizontalLineToRelative(11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.0f, 2.5f)
                verticalLineToRelative(10.528f)
                curveToRelative(0.0f, 0.3f, -0.05f, 0.654f, -0.238f, 0.972f)
                horizontalLineToRelative(0.738f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-9.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 1.0f, 0.0f)
                verticalLineToRelative(9.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -1.5f, 1.5f)
                horizontalLineTo(1.497f)
                arcTo(1.497f, 1.497f, 0.0f, false, true, 0.0f, 13.5f)
                close()
                moveTo(12.0f, 14.0f)
                curveToRelative(0.37f, 0.0f, 0.654f, -0.211f, 0.853f, -0.441f)
                curveToRelative(0.092f, -0.106f, 0.147f, -0.279f, 0.147f, -0.531f)
                verticalLineTo(2.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-11.0f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(11.0f)
                curveToRelative(0.0f, 0.278f, 0.223f, 0.5f, 0.497f, 0.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 5.0f)
                close()
                moveTo(2.0f, 6.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                lineTo(2.0f, 9.0f)
                close()
                moveTo(2.0f, 10.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 11.0f)
                close()
                moveTo(2.0f, 12.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                lineTo(2.0f, 13.0f)
                close()
                moveTo(7.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(10.0f, 6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(7.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                lineTo(7.0f, 9.0f)
                close()
                moveTo(10.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(7.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                lineTo(7.0f, 11.0f)
                close()
                moveTo(10.0f, 10.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                close()
                moveTo(7.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                lineTo(7.0f, 13.0f)
                close()
                moveTo(10.0f, 12.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _newspaper!!
    }

private var _newspaper: ImageVector? = null
