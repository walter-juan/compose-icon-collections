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

public val SolidGroup.Teletype: ImageVector
    get() {
        if (_teletype != null) {
            return _teletype!!
        }
        _teletype = Builder(name = "Teletype", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(450.2f, 266.8f)
                curveToRelative(15.8f, 6.5f, 34.1f, 0.3f, 42.6f, -14.6f)
                lineToRelative(2.4f, -4.2f)
                curveToRelative(27.9f, -48.9f, 23.6f, -118.8f, -31.3f, -154.5f)
                curveToRelative(-126.0f, -82.0f, -289.6f, -82.0f, -415.6f, 0.0f)
                curveToRelative(-54.9f, 35.7f, -59.3f, 105.7f, -31.3f, 154.5f)
                lineToRelative(2.4f, 4.2f)
                curveToRelative(8.5f, 14.9f, 26.7f, 21.1f, 42.6f, 14.6f)
                lineToRelative(81.9f, -33.7f)
                curveToRelative(13.9f, -5.7f, 22.4f, -19.9f, 20.9f, -34.9f)
                lineToRelative(-5.1f, -51.0f)
                curveToRelative(62.5f, -21.0f, 130.8f, -19.9f, 192.6f, 3.3f)
                lineToRelative(-4.8f, 47.7f)
                curveToRelative(-1.5f, 15.0f, 7.0f, 29.2f, 20.9f, 34.9f)
                lineToRelative(81.9f, 33.7f)
                close()
                moveTo(32.0f, 352.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -64.0f, 0.0f)
                close()
                moveTo(128.0f, 352.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -64.0f, 0.0f)
                close()
                moveTo(64.0f, 416.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                close()
                moveTo(416.0f, 448.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -64.0f, 0.0f)
                close()
                moveTo(256.0f, 320.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                close()
                moveTo(320.0f, 352.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -64.0f, 0.0f)
                close()
                moveTo(448.0f, 320.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                close()
                moveTo(128.0f, 448.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(192.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-192.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _teletype!!
    }

private var _teletype: ImageVector? = null
