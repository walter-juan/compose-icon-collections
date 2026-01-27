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

public val SolidGroup.Users: ImageVector
    get() {
        if (_users != null) {
            return _users!!
        }
        _users = Builder(name = "Users", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 16.0f)
                arcToRelative(104.0f, 104.0f, 0.0f, true, true, 0.0f, 208.0f)
                arcToRelative(104.0f, 104.0f, 0.0f, true, true, 0.0f, -208.0f)
                close()
                moveTo(96.0f, 88.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, true, 0.0f, 144.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, true, 0.0f, -144.0f)
                close()
                moveTo(0.0f, 416.0f)
                curveToRelative(0.0f, -70.7f, 57.3f, -128.0f, 128.0f, -128.0f)
                curveToRelative(12.8f, 0.0f, 25.2f, 1.9f, 36.9f, 5.4f)
                curveToRelative(-32.9f, 36.8f, -52.9f, 85.4f, -52.9f, 138.6f)
                lineToRelative(0.0f, 16.0f)
                curveToRelative(0.0f, 11.4f, 2.4f, 22.2f, 6.7f, 32.0f)
                lineTo(32.0f, 480.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -32.0f)
                close()
                moveTo(521.3f, 480.0f)
                curveToRelative(4.3f, -9.8f, 6.7f, -20.6f, 6.7f, -32.0f)
                lineToRelative(0.0f, -16.0f)
                curveToRelative(0.0f, -53.2f, -20.0f, -101.8f, -52.9f, -138.6f)
                curveToRelative(11.7f, -3.5f, 24.1f, -5.4f, 36.9f, -5.4f)
                curveToRelative(70.7f, 0.0f, 128.0f, 57.3f, 128.0f, 128.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-86.7f, 0.0f)
                close()
                moveTo(472.0f, 160.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, true, 144.0f, 0.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, true, true, -144.0f, 0.0f)
                close()
                moveTo(160.0f, 432.0f)
                curveToRelative(0.0f, -88.4f, 71.6f, -160.0f, 160.0f, -160.0f)
                reflectiveCurveToRelative(160.0f, 71.6f, 160.0f, 160.0f)
                lineToRelative(0.0f, 16.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-256.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _users!!
    }

private var _users: ImageVector? = null
