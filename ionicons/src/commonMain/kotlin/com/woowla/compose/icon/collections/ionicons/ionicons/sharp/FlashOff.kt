package com.woowla.compose.icon.collections.ionicons.ionicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.ionicons.ionicons.SharpGroup

public val SharpGroup.FlashOff: ImageVector
    get() {
        if (_flashOff != null) {
            return _flashOff!!
        }
        _flashOff = Builder(name = "FlashOff", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 86.0f)
                lineToRelative(22.0f, -22.0f)
                lineToRelative(362.0f, 362.0f)
                lineToRelative(-22.0f, 22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 304.0f)
                lineToRelative(144.0f, 0.0f)
                lineToRelative(-32.0f, 192.0f)
                lineToRelative(108.18f, -129.82f)
                lineToRelative(-148.36f, -148.36f)
                lineToRelative(-71.82f, 86.18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(432.0f, 208.0f)
                lineToRelative(-144.0f, 0.0f)
                lineToRelative(32.0f, -192.0f)
                lineToRelative(-108.18f, 129.82f)
                lineToRelative(148.36f, 148.36f)
                lineToRelative(71.82f, -86.18f)
                close()
            }
        }
        .build()
        return _flashOff!!
    }

private var _flashOff: ImageVector? = null
