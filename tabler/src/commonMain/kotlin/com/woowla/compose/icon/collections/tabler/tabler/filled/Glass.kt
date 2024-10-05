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

public val FilledGroup.Glass: ImageVector
    get() {
        if (_glass != null) {
            return _glass!!
        }
        _glass = Builder(name = "Glass", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(3.205f, 0.0f, 5.894f, 1.05f, 5.997f, 2.89f)
                lineToRelative(0.99f, 5.946f)
                lineToRelative(0.013f, 0.164f)
                curveToRelative(0.0f, 3.226f, -2.56f, 5.564f, -6.0f, 5.945f)
                verticalLineToRelative(3.055f)
                horizontalLineToRelative(3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.055f)
                curveToRelative(-3.44f, -0.38f, -6.0f, -2.719f, -6.0f, -5.945f)
                lineToRelative(0.014f, -0.164f)
                lineToRelative(0.991f, -5.955f)
                lineToRelative(0.001f, -0.038f)
                curveToRelative(0.146f, -1.81f, 2.817f, -2.843f, 5.994f, -2.843f)
                moveToRelative(0.0f, 2.0f)
                curveToRelative(-1.224f, 0.0f, -2.359f, 0.192f, -3.164f, 0.514f)
                curveToRelative(-0.594f, 0.238f, -0.836f, 0.467f, -0.836f, 0.486f)
                curveToRelative(0.0f, 0.02f, 0.242f, 0.248f, 0.836f, 0.486f)
                curveToRelative(0.804f, 0.322f, 1.94f, 0.514f, 3.164f, 0.514f)
                reflectiveCurveToRelative(2.359f, -0.192f, 3.164f, -0.514f)
                curveToRelative(0.594f, -0.238f, 0.836f, -0.467f, 0.836f, -0.486f)
                lineToRelative(-0.02f, -0.026f)
                curveToRelative(-0.07f, -0.07f, -0.321f, -0.262f, -0.816f, -0.46f)
                curveToRelative(-0.804f, -0.322f, -1.94f, -0.514f, -3.164f, -0.514f)
            }
        }
        .build()
        return _glass!!
    }

private var _glass: ImageVector? = null
