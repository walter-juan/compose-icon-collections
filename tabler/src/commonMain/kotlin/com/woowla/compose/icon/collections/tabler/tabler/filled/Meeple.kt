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

public val FilledGroup.Meeple: ImageVector
    get() {
        if (_meeple != null) {
            return _meeple!!
        }
        _meeple = Builder(name = "Meeple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(2.486f, 0.0f, 3.713f, 1.766f, 3.955f, 4.1f)
                lineToRelative(0.01f, 0.124f)
                lineToRelative(0.129f, 0.036f)
                curveToRelative(3.17f, 0.928f, 5.754f, 2.487f, 5.9f, 4.556f)
                lineToRelative(0.006f, 0.184f)
                curveToRelative(0.0f, 1.427f, -1.297f, 2.322f, -2.871f, 2.733f)
                lineToRelative(-0.201f, 0.049f)
                lineToRelative(0.026f, 0.03f)
                curveToRelative(0.244f, 0.276f, 0.532f, 0.603f, 0.7f, 0.797f)
                lineToRelative(0.057f, 0.066f)
                curveToRelative(0.49f, 0.573f, 0.884f, 1.073f, 1.216f, 1.56f)
                curveToRelative(0.69f, 1.01f, 1.073f, 1.904f, 1.073f, 2.765f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-1.043f, 0.0f, -1.344f, -0.453f, -2.394f, -2.553f)
                curveToRelative(-0.29f, -0.58f, -0.448f, -0.882f, -0.593f, -1.118f)
                lineToRelative(-0.013f, -0.022f)
                lineToRelative(-0.013f, 0.022f)
                curveToRelative(-0.129f, 0.21f, -0.268f, 0.472f, -0.5f, 0.935f)
                lineToRelative(-0.093f, 0.183f)
                curveToRelative(-1.05f, 2.1f, -1.351f, 2.553f, -2.394f, 2.553f)
                horizontalLineToRelative(-5.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                curveToRelative(0.0f, -0.86f, 0.384f, -1.755f, 1.073f, -2.765f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 1.216f, -1.56f)
                curveToRelative(0.152f, -0.178f, 0.482f, -0.553f, 0.757f, -0.863f)
                lineToRelative(0.025f, -0.03f)
                lineToRelative(-0.2f, -0.049f)
                curveToRelative(-1.506f, -0.393f, -2.758f, -1.23f, -2.864f, -2.55f)
                lineToRelative(-0.007f, -0.183f)
                curveToRelative(0.0f, -2.16f, 2.643f, -3.785f, 5.906f, -4.74f)
                lineToRelative(0.128f, -0.036f)
                lineToRelative(0.011f, -0.124f)
                curveToRelative(0.235f, -2.26f, 1.394f, -3.99f, 3.726f, -4.095f)
                close()
            }
        }
        .build()
        return _meeple!!
    }

private var _meeple: ImageVector? = null
