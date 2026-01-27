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

public val SolidGroup.CarriageBaby: ImageVector
    get() {
        if (_carriageBaby != null) {
            return _carriageBaby!!
        }
        _carriageBaby = Builder(name = "CarriageBaby", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 208.0f)
                lineToRelative(0.0f, 80.0f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                lineToRelative(192.0f, 0.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, -43.0f, 96.0f, -96.0f)
                lineToRelative(0.0f, -112.0f)
                lineToRelative(40.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineToRelative(-64.0f, 0.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                lineToRelative(0.0f, 56.0f)
                lineToRelative(-336.0f, 0.0f)
                close()
                moveTo(64.2f, 160.0f)
                lineToRelative(223.8f, 0.0f)
                lineToRelative(0.0f, -128.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(232.0f, 0.0f)
                curveTo(141.9f, 0.0f, 68.4f, 70.9f, 64.2f, 160.0f)
                close()
                moveTo(160.0f, 464.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 96.0f, 0.0f)
                close()
                moveTo(448.0f, 464.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 96.0f, 0.0f)
                close()
            }
        }
        .build()
        return _carriageBaby!!
    }

private var _carriageBaby: ImageVector? = null
