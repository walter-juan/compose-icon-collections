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

public val Twbs.Boxes: ImageVector
    get() {
        if (_boxes != null) {
            return _boxes!!
        }
        _boxes = Builder(name = "Boxes", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.752f, 0.066f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.496f, 0.0f)
                lineToRelative(3.75f, 2.143f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.252f, 0.434f)
                verticalLineToRelative(3.995f)
                lineToRelative(3.498f, 2.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 16.0f, 9.07f)
                verticalLineToRelative(4.286f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.252f, 0.434f)
                lineToRelative(-3.75f, 2.143f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.496f, 0.0f)
                lineToRelative(-3.502f, -2.0f)
                lineToRelative(-3.502f, 2.001f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.496f, 0.0f)
                lineToRelative(-3.75f, -2.143f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 0.0f, 13.357f)
                lineTo(0.0f, 9.071f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.252f, -0.434f)
                lineTo(3.75f, 6.638f)
                lineTo(3.75f, 2.643f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.252f, -0.434f)
                close()
                moveTo(4.25f, 7.504f)
                lineTo(1.508f, 9.071f)
                lineToRelative(2.742f, 1.567f)
                lineToRelative(2.742f, -1.567f)
                close()
                moveTo(7.5f, 9.933f)
                lineToRelative(-2.75f, 1.571f)
                verticalLineToRelative(3.134f)
                lineToRelative(2.75f, -1.571f)
                close()
                moveTo(8.5f, 13.067f)
                lineTo(11.25f, 14.638f)
                verticalLineToRelative(-3.134f)
                lineTo(8.5f, 9.933f)
                close()
                moveTo(9.008f, 9.071f)
                lineTo(11.75f, 10.638f)
                lineTo(14.492f, 9.071f)
                lineTo(11.75f, 7.504f)
                close()
                moveTo(11.25f, 6.638f)
                lineTo(11.25f, 3.504f)
                lineTo(8.5f, 5.076f)
                lineTo(8.5f, 8.21f)
                close()
                moveTo(7.5f, 8.21f)
                lineTo(7.5f, 5.076f)
                lineTo(4.75f, 3.504f)
                verticalLineToRelative(3.134f)
                close()
                moveTo(5.258f, 2.643f)
                lineTo(8.0f, 4.21f)
                lineToRelative(2.742f, -1.567f)
                lineTo(8.0f, 1.076f)
                close()
                moveTo(15.0f, 9.933f)
                lineToRelative(-2.75f, 1.571f)
                verticalLineToRelative(3.134f)
                lineTo(15.0f, 13.067f)
                close()
                moveTo(3.75f, 14.638f)
                verticalLineToRelative(-3.134f)
                lineTo(1.0f, 9.933f)
                verticalLineToRelative(3.134f)
                close()
            }
        }
        .build()
        return _boxes!!
    }

private var _boxes: ImageVector? = null
