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

public val FilledGroup.Clover: ImageVector
    get() {
        if (_clover != null) {
            return _clover!!
        }
        _clover = Builder(name = "Clover", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.712f, 13.297f)
                lineToRelative(3.398f, 3.442f)
                arcToRelative(3.104f, 3.104f, 0.0f, false, true, 0.0f, 4.351f)
                arcToRelative(3.04f, 3.04f, 0.0f, false, true, -4.036f, 0.27f)
                lineToRelative(-0.075f, -0.062f)
                lineToRelative(-0.073f, 0.062f)
                arcToRelative(3.04f, 3.04f, 0.0f, false, true, -1.664f, 0.634f)
                lineToRelative(-0.203f, 0.007f)
                arcToRelative(3.04f, 3.04f, 0.0f, false, true, -2.17f, -0.91f)
                arcToRelative(3.104f, 3.104f, 0.0f, false, true, 0.002f, -4.354f)
                lineToRelative(3.397f, -3.44f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.424f, 0.0f)
                moveToRelative(8.378f, -5.407f)
                arcToRelative(3.04f, 3.04f, 0.0f, false, true, 0.27f, 4.037f)
                lineToRelative(-0.062f, 0.073f)
                lineToRelative(0.062f, 0.075f)
                arcToRelative(3.04f, 3.04f, 0.0f, false, true, 0.634f, 1.664f)
                lineToRelative(0.007f, 0.203f)
                arcToRelative(3.04f, 3.04f, 0.0f, false, true, -0.91f, 2.17f)
                arcToRelative(3.104f, 3.104f, 0.0f, false, true, -4.354f, -0.002f)
                lineToRelative(-3.44f, -3.397f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.424f)
                lineToRelative(3.443f, -3.399f)
                arcToRelative(3.104f, 3.104f, 0.0f, false, true, 4.351f, 0.0f)
                moveToRelative(-13.827f, 0.002f)
                lineToRelative(3.44f, 3.397f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.424f)
                lineToRelative(-3.444f, 3.397f)
                arcToRelative(3.104f, 3.104f, 0.0f, false, true, -4.351f, 0.0f)
                arcToRelative(3.04f, 3.04f, 0.0f, false, true, -0.27f, -4.036f)
                lineToRelative(0.062f, -0.075f)
                lineToRelative(-0.062f, -0.073f)
                arcToRelative(3.04f, 3.04f, 0.0f, false, true, -0.634f, -1.664f)
                lineToRelative(-0.007f, -0.203f)
                curveToRelative(0.0f, -0.816f, 0.328f, -1.598f, 0.91f, -2.17f)
                arcToRelative(3.104f, 3.104f, 0.0f, false, true, 4.354f, 0.002f)
                moveToRelative(6.678f, -5.891f)
                arcToRelative(3.04f, 3.04f, 0.0f, false, true, 2.17f, 0.91f)
                arcToRelative(3.104f, 3.104f, 0.0f, false, true, -0.002f, 4.354f)
                lineToRelative(-3.397f, 3.44f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.424f, 0.0f)
                lineToRelative(-3.397f, -3.444f)
                arcToRelative(3.104f, 3.104f, 0.0f, false, true, 0.0f, -4.351f)
                arcToRelative(3.04f, 3.04f, 0.0f, false, true, 4.036f, -0.27f)
                lineToRelative(0.073f, 0.062f)
                lineToRelative(0.075f, -0.062f)
                arcToRelative(3.04f, 3.04f, 0.0f, false, true, 1.664f, -0.634f)
                close()
            }
        }
        .build()
        return _clover!!
    }

private var _clover: ImageVector? = null
