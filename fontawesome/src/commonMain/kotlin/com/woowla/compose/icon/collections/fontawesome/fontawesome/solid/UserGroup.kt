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

public val SolidGroup.UserGroup: ImageVector
    get() {
        if (_userGroup != null) {
            return _userGroup!!
        }
        _userGroup = Builder(name = "UserGroup", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 128.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, true, true, 224.0f, 0.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, true, true, -224.0f, 0.0f)
                close()
                moveTo(0.0f, 464.0f)
                curveToRelative(0.0f, -97.2f, 78.8f, -176.0f, 176.0f, -176.0f)
                reflectiveCurveToRelative(176.0f, 78.8f, 176.0f, 176.0f)
                lineToRelative(0.0f, 6.0f)
                curveToRelative(0.0f, 23.2f, -18.8f, 42.0f, -42.0f, 42.0f)
                lineTo(42.0f, 512.0f)
                curveToRelative(-23.2f, 0.0f, -42.0f, -18.8f, -42.0f, -42.0f)
                lineToRelative(0.0f, -6.0f)
                close()
                moveTo(432.0f, 64.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, 0.0f, 192.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, 0.0f, -192.0f)
                close()
                moveTo(432.0f, 304.0f)
                curveToRelative(79.5f, 0.0f, 144.0f, 64.5f, 144.0f, 144.0f)
                lineToRelative(0.0f, 22.4f)
                curveToRelative(0.0f, 23.0f, -18.6f, 41.6f, -41.6f, 41.6f)
                lineToRelative(-144.8f, 0.0f)
                curveToRelative(6.6f, -12.5f, 10.4f, -26.8f, 10.4f, -42.0f)
                lineToRelative(0.0f, -6.0f)
                curveToRelative(0.0f, -51.5f, -17.4f, -98.9f, -46.5f, -136.7f)
                curveToRelative(22.6f, -14.7f, 49.6f, -23.3f, 78.5f, -23.3f)
                close()
            }
        }
        .build()
        return _userGroup!!
    }

private var _userGroup: ImageVector? = null
