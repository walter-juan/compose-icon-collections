package com.woowla.compose.icon.collections.fontawesome.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.SolidGroup

public val SolidGroup.Grimace: ImageVector
    get() {
        if (_grimace != null) {
            return _grimace!!
        }
        _grimace = Builder(name = "Grimace", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, -512.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                close()
                moveTo(400.0f, 352.0f)
                curveToRelative(0.0f, 25.2f, -19.4f, 45.8f, -44.0f, 47.8f)
                lineToRelative(0.0f, -95.7f)
                curveToRelative(24.6f, 2.0f, 44.0f, 22.7f, 44.0f, 47.8f)
                close()
                moveTo(276.0f, 304.0f)
                lineToRelative(40.0f, 0.0f)
                lineToRelative(0.0f, 96.0f)
                lineToRelative(-40.0f, 0.0f)
                lineToRelative(0.0f, -96.0f)
                close()
                moveTo(196.0f, 400.0f)
                lineToRelative(0.0f, -96.0f)
                lineToRelative(40.0f, 0.0f)
                lineToRelative(0.0f, 96.0f)
                lineToRelative(-40.0f, 0.0f)
                close()
                moveTo(156.0f, 304.2f)
                lineToRelative(0.0f, 95.7f)
                curveToRelative(-24.6f, -2.0f, -44.0f, -22.7f, -44.0f, -47.8f)
                reflectiveCurveToRelative(19.4f, -45.8f, 44.0f, -47.8f)
                close()
                moveTo(144.0f, 208.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, -64.0f, 0.0f)
                close()
                moveTo(336.0f, 176.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 0.0f, -64.0f)
                close()
            }
        }
        .build()
        return _grimace!!
    }

private var _grimace: ImageVector? = null
