package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.PatchCheckFill: ImageVector
    get() {
        if (_patchCheckFill != null) {
            return _patchCheckFill!!
        }
        _patchCheckFill = Builder(name = "PatchCheckFill", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.067f, 0.87f)
                arcToRelative(2.89f, 2.89f, 0.0f, false, false, -4.134f, 0.0f)
                lineToRelative(-0.622f, 0.638f)
                lineToRelative(-0.89f, -0.011f)
                arcToRelative(2.89f, 2.89f, 0.0f, false, false, -2.924f, 2.924f)
                lineToRelative(0.01f, 0.89f)
                lineToRelative(-0.636f, 0.622f)
                arcToRelative(2.89f, 2.89f, 0.0f, false, false, 0.0f, 4.134f)
                lineToRelative(0.637f, 0.622f)
                lineToRelative(-0.011f, 0.89f)
                arcToRelative(2.89f, 2.89f, 0.0f, false, false, 2.924f, 2.924f)
                lineToRelative(0.89f, -0.01f)
                lineToRelative(0.622f, 0.636f)
                arcToRelative(2.89f, 2.89f, 0.0f, false, false, 4.134f, 0.0f)
                lineToRelative(0.622f, -0.637f)
                lineToRelative(0.89f, 0.011f)
                arcToRelative(2.89f, 2.89f, 0.0f, false, false, 2.924f, -2.924f)
                lineToRelative(-0.01f, -0.89f)
                lineToRelative(0.636f, -0.622f)
                arcToRelative(2.89f, 2.89f, 0.0f, false, false, 0.0f, -4.134f)
                lineToRelative(-0.637f, -0.622f)
                lineToRelative(0.011f, -0.89f)
                arcToRelative(2.89f, 2.89f, 0.0f, false, false, -2.924f, -2.924f)
                lineToRelative(-0.89f, 0.01f)
                close()
                moveTo(10.354f, 6.854f)
                lineTo(7.354f, 9.854f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.708f, 0.0f)
                lineToRelative(-1.5f, -1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, true, true, 0.708f, -0.708f)
                lineTo(7.0f, 8.793f)
                lineToRelative(2.646f, -2.647f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.708f, 0.708f)
            }
        }
        .build()
        return _patchCheckFill!!
    }

private var _patchCheckFill: ImageVector? = null
