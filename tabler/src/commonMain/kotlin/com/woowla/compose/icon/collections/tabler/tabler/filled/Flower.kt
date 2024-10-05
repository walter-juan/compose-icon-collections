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

public val FilledGroup.Flower: ImageVector
    get() {
        if (_flower != null) {
            return _flower!!
        }
        _flower = Builder(name = "Flower", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineToRelative(-0.002f, 0.055f)
                lineToRelative(0.03f, -0.018f)
                arcToRelative(3.97f, 3.97f, 0.0f, false, true, 2.79f, -0.455f)
                lineToRelative(0.237f, 0.056f)
                arcToRelative(3.97f, 3.97f, 0.0f, false, true, 2.412f, 1.865f)
                arcToRelative(4.01f, 4.01f, 0.0f, false, true, -1.455f, 5.461f)
                lineToRelative(-0.068f, 0.036f)
                lineToRelative(0.071f, 0.039f)
                arcToRelative(4.01f, 4.01f, 0.0f, false, true, 1.555f, 5.27f)
                lineToRelative(-0.101f, 0.186f)
                arcToRelative(3.97f, 3.97f, 0.0f, false, true, -5.441f, 1.468f)
                lineToRelative(-0.03f, -0.02f)
                lineToRelative(0.002f, 0.057f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.8f, 3.995f)
                lineToRelative(-0.2f, 0.005f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineToRelative(0.001f, -0.056f)
                lineToRelative(-0.029f, 0.019f)
                arcToRelative(3.97f, 3.97f, 0.0f, false, true, -2.79f, 0.456f)
                lineToRelative(-0.236f, -0.056f)
                arcToRelative(3.97f, 3.97f, 0.0f, false, true, -2.413f, -1.865f)
                arcToRelative(4.01f, 4.01f, 0.0f, false, true, 1.453f, -5.46f)
                lineToRelative(0.07f, -0.038f)
                lineToRelative(-0.071f, -0.038f)
                arcToRelative(4.01f, 4.01f, 0.0f, false, true, -1.555f, -5.27f)
                lineToRelative(0.1f, -0.187f)
                arcToRelative(3.97f, 3.97f, 0.0f, false, true, 5.444f, -1.468f)
                lineToRelative(0.026f, 0.018f)
                verticalLineToRelative(-0.055f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.8f, -3.995f)
                close()
                moveTo(12.0f, 9.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -6.0f)
            }
        }
        .build()
        return _flower!!
    }

private var _flower: ImageVector? = null
