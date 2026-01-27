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

public val SolidGroup.Handcuffs: ImageVector
    get() {
        if (_handcuffs != null) {
            return _handcuffs!!
        }
        _handcuffs = Builder(name = "Handcuffs", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, -32.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                close()
                moveTo(192.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                close()
                moveTo(152.0f, 96.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                lineToRelative(0.0f, 16.0f)
                curveToRelative(0.0f, 1.0f, 0.1f, 1.9f, 0.2f, 2.9f)
                curveToRelative(-74.7f, 26.3f, -128.2f, 97.5f, -128.2f, 181.1f)
                curveToRelative(0.0f, 106.0f, 86.0f, 192.0f, 192.0f, 192.0f)
                reflectiveCurveToRelative(192.0f, -86.0f, 192.0f, -192.0f)
                curveToRelative(0.0f, -83.7f, -53.5f, -154.8f, -128.2f, -181.1f)
                curveToRelative(0.1f, -0.9f, 0.2f, -1.9f, 0.2f, -2.9f)
                lineToRelative(0.0f, -16.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-80.0f, 0.0f)
                close()
                moveTo(64.0f, 320.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, true, 256.0f, 0.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, true, -256.0f, 0.0f)
                close()
                moveTo(512.0f, 320.0f)
                curveToRelative(0.0f, 66.9f, -51.3f, 121.8f, -116.6f, 127.5f)
                curveToRelative(-14.3f, 22.8f, -32.4f, 43.1f, -53.4f, 59.9f)
                curveToRelative(13.5f, 3.0f, 27.6f, 4.6f, 42.0f, 4.6f)
                curveToRelative(106.0f, 0.0f, 192.0f, -86.0f, 192.0f, -192.0f)
                curveToRelative(0.0f, -83.7f, -53.5f, -154.8f, -128.2f, -181.1f)
                curveToRelative(0.1f, -0.9f, 0.2f, -1.9f, 0.2f, -2.9f)
                lineToRelative(0.0f, -16.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-80.0f, 0.0f)
                curveToRelative(-12.3f, 0.0f, -22.4f, 9.2f, -23.8f, 21.1f)
                curveToRelative(30.3f, 19.2f, 56.1f, 45.0f, 75.2f, 75.4f)
                curveToRelative(65.4f, 5.8f, 116.6f, 60.6f, 116.6f, 127.5f)
                close()
                moveTo(384.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                close()
            }
        }
        .build()
        return _handcuffs!!
    }

private var _handcuffs: ImageVector? = null
