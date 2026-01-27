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

public val Octicons.SmileyGrin16: ImageVector
    get() {
        if (_smileyGrin16 != null) {
            return _smileyGrin16!!
        }
        _smileyGrin16 = Builder(name = "SmileyGrin16", defaultWidth = 16.0.dp, defaultHeight =
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
                moveTo(11.0f, 9.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.727f, 0.932f)
                curveTo(11.518f, 11.02f, 10.487f, 13.0f, 8.0f, 13.0f)
                reflectiveCurveToRelative(-3.518f, -1.98f, -3.728f, -2.818f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 5.0f, 9.25f)
                close()
                moveTo(8.329f, 6.164f)
                curveToRelative(0.895f, -1.788f, 3.447f, -1.788f, 4.342f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.342f, 0.671f)
                arcToRelative(0.927f, 0.927f, 0.0f, false, false, -1.658f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.342f, -0.671f)
                close()
                moveTo(3.329f, 6.164f)
                curveToRelative(0.895f, -1.788f, 3.447f, -1.788f, 4.342f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.342f, 0.671f)
                arcToRelative(0.927f, 0.927f, 0.0f, false, false, -1.658f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.342f, -0.671f)
                close()
                moveTo(6.254f, 10.75f)
                curveToRelative(0.363f, 0.399f, 0.924f, 0.75f, 1.746f, 0.75f)
                reflectiveCurveToRelative(1.383f, -0.351f, 1.746f, -0.75f)
                close()
            }
        }
        .build()
        return _smileyGrin16!!
    }

private var _smileyGrin16: ImageVector? = null
