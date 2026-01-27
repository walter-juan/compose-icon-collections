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

public val Octicons.SmileyNeutral16: ImageVector
    get() {
        if (_smileyNeutral16 != null) {
            return _smileyNeutral16!!
        }
        _smileyNeutral16 = Builder(name = "SmileyNeutral16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 0.0f)
                arcToRelative(7.996f, 7.996f, 0.0f, false, true, 8.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                close()
                moveTo(8.0f, 1.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, false, 0.0f, 13.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 0.0f, -13.0f)
                close()
                moveTo(10.0f, 10.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                lineTo(6.0f, 11.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                close()
                moveTo(5.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 1.998f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 6.0f)
                close()
                moveTo(11.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, 1.998f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 6.0f)
                close()
            }
        }
        .build()
        return _smileyNeutral16!!
    }

private var _smileyNeutral16: ImageVector? = null
