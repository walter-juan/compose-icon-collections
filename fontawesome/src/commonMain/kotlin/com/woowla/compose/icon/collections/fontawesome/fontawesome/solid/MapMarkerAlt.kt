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

public val SolidGroup.MapMarkerAlt: ImageVector
    get() {
        if (_mapMarkerAlt != null) {
            return _mapMarkerAlt!!
        }
        _mapMarkerAlt = Builder(name = "MapMarkerAlt", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 188.6f)
                curveTo(0.0f, 84.4f, 86.0f, 0.0f, 192.0f, 0.0f)
                reflectiveCurveTo(384.0f, 84.4f, 384.0f, 188.6f)
                curveToRelative(0.0f, 119.3f, -120.2f, 262.3f, -170.4f, 316.8f)
                curveToRelative(-11.8f, 12.8f, -31.5f, 12.8f, -43.3f, 0.0f)
                curveToRelative(-50.2f, -54.5f, -170.4f, -197.5f, -170.4f, -316.8f)
                close()
                moveTo(192.0f, 256.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 0.0f, -128.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, false, 0.0f, 128.0f)
                close()
            }
        }
        .build()
        return _mapMarkerAlt!!
    }

private var _mapMarkerAlt: ImageVector? = null
