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

public val FilledGroup.Cloud: ImageVector
    get() {
        if (_cloud != null) {
            return _cloud!!
        }
        _cloud = Builder(name = "Cloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.04f, 4.305f)
                curveToRelative(2.195f, -0.667f, 4.615f, -0.224f, 6.36f, 1.176f)
                curveToRelative(1.386f, 1.108f, 2.188f, 2.686f, 2.252f, 4.34f)
                lineToRelative(0.003f, 0.212f)
                lineToRelative(0.091f, 0.003f)
                curveToRelative(2.3f, 0.107f, 4.143f, 1.961f, 4.25f, 4.27f)
                lineToRelative(0.004f, 0.211f)
                curveToRelative(0.0f, 2.407f, -1.885f, 4.372f, -4.255f, 4.482f)
                lineToRelative(-0.21f, 0.005f)
                horizontalLineToRelative(-11.878f)
                lineToRelative(-0.222f, -0.008f)
                curveToRelative(-2.94f, -0.11f, -5.317f, -2.399f, -5.43f, -5.263f)
                lineToRelative(-0.005f, -0.216f)
                curveToRelative(0.0f, -2.747f, 2.08f, -5.01f, 4.784f, -5.417f)
                lineToRelative(0.114f, -0.016f)
                lineToRelative(0.07f, -0.181f)
                curveToRelative(0.663f, -1.62f, 2.056f, -2.906f, 3.829f, -3.518f)
                lineToRelative(0.244f, -0.08f)
                close()
            }
        }
        .build()
        return _cloud!!
    }

private var _cloud: ImageVector? = null
