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

public val FilledGroup.Bone: ImageVector
    get() {
        if (_bone != null) {
            return _bone!!
        }
        _bone = Builder(name = "Bone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.881f, 3.03f)
                lineToRelative(0.016f, 0.072f)
                lineToRelative(0.08f, 0.019f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.83f, 2.65f)
                lineToRelative(0.057f, 0.193f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.847f, 4.51f)
                lineToRelative(-0.047f, -0.029f)
                lineToRelative(-3.525f, 3.525f)
                lineToRelative(0.042f, 0.07f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.117f, 3.696f)
                lineToRelative(-0.102f, 0.197f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.386f, 1.969f)
                arcToRelative(3.99f, 3.99f, 0.0f, false, true, -2.982f, -2.904f)
                lineToRelative(-0.023f, -0.095f)
                lineToRelative(-0.138f, -0.033f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.82f, -2.783f)
                lineToRelative(-0.05f, -0.199f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.865f, -4.368f)
                lineToRelative(0.068f, 0.04f)
                lineToRelative(3.524f, -3.524f)
                lineToRelative(-0.036f, -0.061f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -0.293f, -3.295f)
                lineToRelative(0.079f, -0.205f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.695f, -2.47f)
                lineToRelative(-0.139f, 0.004f)
                lineToRelative(0.02f, -0.003f)
                close()
            }
        }
        .build()
        return _bone!!
    }

private var _bone: ImageVector? = null
