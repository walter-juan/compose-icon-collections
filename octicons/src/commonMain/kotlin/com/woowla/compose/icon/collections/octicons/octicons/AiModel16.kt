package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.AiModel16: ImageVector
    get() {
        if (_aiModel16 != null) {
            return _aiModel16!!
        }
        _aiModel16 = Builder(name = "AiModel16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.628f, 7.25f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, 0.0f, 1.5f)
                lineTo(8.622f, 8.75f)
                arcToRelative(2.25f, 2.25f, 0.0f, false, true, -2.513f, 1.466f)
                lineTo(5.03f, 12.124f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, -1.262f, -0.814f)
                lineToRelative(1.035f, -1.832f)
                arcTo(2.245f, 2.245f, 0.0f, false, true, 4.25f, 8.0f)
                curveToRelative(0.0f, -0.566f, 0.209f, -1.082f, 0.553f, -1.478f)
                lineTo(3.768f, 4.69f)
                arcToRelative(2.25f, 2.25f, 0.0f, true, true, 1.262f, -0.814f)
                lineToRelative(1.079f, 1.908f)
                arcTo(2.25f, 2.25f, 0.0f, false, true, 8.622f, 7.25f)
                close()
                moveTo(2.5f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.5f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                close()
                moveTo(6.5f, 7.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
                moveTo(12.75f, 7.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
                moveTo(3.25f, 12.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.0f, 1.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                close()
            }
        }
        .build()
        return _aiModel16!!
    }

private var _aiModel16: ImageVector? = null
