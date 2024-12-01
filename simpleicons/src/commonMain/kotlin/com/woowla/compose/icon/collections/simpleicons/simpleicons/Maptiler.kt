package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Maptiler: ImageVector
    get() {
        if (_maptiler != null) {
            return _maptiler!!
        }
        _maptiler = Builder(name = "Maptiler", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.794f, 1.655f)
                lineToRelative(4.188f, 4.188f)
                lineToRelative(4.204f, -4.204f)
                arcTo(6.13f, 6.13f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(6.136f, 6.136f, 0.0f, false, false, -4.204f, 1.655f)
                close()
                moveTo(3.25f, 6.197f)
                lineTo(7.455f, 1.99f)
                lineToRelative(4.19f, 4.19f)
                lineToRelative(-4.206f, 4.207f)
                close()
                moveTo(2.935f, 14.894f)
                lineTo(7.103f, 10.726f)
                lineTo(4.214f, 7.836f)
                lineTo(2.916f, 6.537f)
                arcToRelative(6.19f, 6.19f, 0.0f, false, false, 0.02f, 8.357f)
                close()
                moveTo(17.663f, 9.254f)
                lineTo(20.736f, 6.181f)
                lineTo(16.528f, 1.974f)
                lineTo(12.321f, 6.181f)
                lineTo(16.528f, 10.387f)
                close()
                moveTo(11.648f, 15.267f)
                lineTo(7.44f, 11.061f)
                lineToRelative(-4.172f, 4.172f)
                lineToRelative(4.206f, 4.208f)
                close()
                moveTo(16.864f, 10.724f)
                lineTo(21.049f, 14.909f)
                arcToRelative(6.18f, 6.18f, 0.0f, false, false, 0.02f, -8.387f)
                lineToRelative(-4.205f, 4.202f)
                close()
                moveTo(14.416f, 17.363f)
                lineTo(16.509f, 19.455f)
                lineTo(20.716f, 15.249f)
                lineTo(16.528f, 11.061f)
                lineTo(12.321f, 15.267f)
                close()
                moveTo(11.968f, 24.0f)
                arcToRelative(3007.16f, 3007.16f, 0.0f, false, false, 4.2f, -4.208f)
                lineToRelative(-4.187f, -4.188f)
                lineToRelative(-4.17f, 4.174f)
                curveToRelative(1.386f, 1.407f, 2.773f, 2.813f, 4.157f, 4.222f)
                close()
            }
        }
        .build()
        return _maptiler!!
    }

private var _maptiler: ImageVector? = null
