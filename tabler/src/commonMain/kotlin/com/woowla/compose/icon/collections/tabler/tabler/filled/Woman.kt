package com.woowla.compose.icon.collections.tabler.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.tabler.tabler.FilledGroup

public val FilledGroup.Woman: ImageVector
    get() {
        if (_woman != null) {
            return _woman!!
        }
        _woman = Builder(name = "Woman", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 8.0f)
                curveToRelative(1.91f, 0.0f, 3.79f, 0.752f, 5.625f, 2.219f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.25f, 1.562f)
                curveToRelative(-1.019f, -0.815f, -2.016f, -1.345f, -2.997f, -1.6f)
                lineToRelative(1.584f, 5.544f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.962f, 1.275f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.962f, -1.275f)
                lineToRelative(1.584f, -5.545f)
                curveToRelative(-0.98f, 0.256f, -1.978f, 0.786f, -2.997f, 1.601f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -1.25f, -1.562f)
                curveToRelative(1.733f, -1.386f, 3.506f, -2.133f, 5.307f, -2.212f)
                lineToRelative(0.335f, -0.007f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, -3.0f, 3.0f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 2.995f, -2.824f)
            }
        }
        .build()
        return _woman!!
    }

private var _woman: ImageVector? = null
