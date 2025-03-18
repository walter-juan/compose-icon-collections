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

public val Simpleicons.Mealie: ImageVector
    get() {
        if (_mealie != null) {
            return _mealie!!
        }
        _mealie = Builder(name = "Mealie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.619f, 13.59f)
                lineTo(1.444f, 8.427f)
                curveToRelative(-1.925f, -1.939f, -1.925f, -5.063f, 0.0f, -6.989f)
                lineToRelative(8.666f, 8.642f)
                lineToRelative(-3.491f, 3.51f)
                moveToRelative(6.551f, -0.42f)
                lineToRelative(8.51f, 8.49f)
                lineToRelative(-1.76f, 1.74f)
                lineToRelative(-8.48f, -8.48f)
                lineToRelative(-8.502f, 8.48f)
                lineToRelative(-1.741f, -1.74f)
                lineTo(13.12f, 9.739f)
                lineToRelative(-0.25f, -0.272f)
                arcToRelative(2.448f, 2.448f, 0.0f, false, true, 0.0f, -3.472f)
                lineTo(18.23f, 0.6f)
                lineToRelative(1.14f, 1.135f)
                lineToRelative(-3.99f, 4.024f)
                lineToRelative(1.18f, 1.161f)
                lineToRelative(3.99f, -4.012f)
                lineToRelative(1.15f, 1.136f)
                lineToRelative(-4.01f, 4.0f)
                lineToRelative(1.15f, 1.189f)
                lineToRelative(4.03f, -4.017f)
                lineTo(24.0f, 6.377f)
                lineToRelative(-5.4f, 5.353f)
                curveToRelative(-0.95f, 0.96f, -2.51f, 0.96f, -3.46f, 0.0f)
                lineToRelative(-0.27f, -0.25f)
                close()
            }
        }
        .build()
        return _mealie!!
    }

private var _mealie: ImageVector? = null
