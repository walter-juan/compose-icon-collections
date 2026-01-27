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

public val SolidGroup.ShoePrints: ImageVector
    get() {
        if (_shoePrints != null) {
            return _shoePrints!!
        }
        _shoePrints = Builder(name = "ShoePrints", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(296.0f, 192.0f)
                curveToRelative(-21.1f, -12.1f, -42.3f, -24.2f, -72.0f, -29.3f)
                lineToRelative(0.0f, -140.3f)
                curveTo(257.7f, 13.0f, 311.4f, 0.0f, 352.0f, 0.0f)
                curveTo(448.0f, 0.0f, 576.0f, 48.0f, 576.0f, 128.0f)
                reflectiveCurveToRelative(-119.6f, 96.0f, -176.0f, 96.0f)
                curveToRelative(-48.0f, 0.0f, -76.0f, -16.0f, -104.0f, -32.0f)
                close()
                moveTo(128.0f, 32.0f)
                lineToRelative(48.0f, 0.0f)
                lineToRelative(0.0f, 128.0f)
                lineToRelative(-48.0f, 0.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                reflectiveCurveToRelative(28.7f, -64.0f, 64.0f, -64.0f)
                close()
                moveTo(232.0f, 320.0f)
                curveToRelative(28.0f, -16.0f, 56.0f, -32.0f, 104.0f, -32.0f)
                curveToRelative(56.4f, 0.0f, 176.0f, 16.0f, 176.0f, 96.0f)
                reflectiveCurveTo(384.0f, 512.0f, 288.0f, 512.0f)
                curveToRelative(-40.5f, 0.0f, -94.3f, -13.0f, -128.0f, -22.4f)
                lineToRelative(0.0f, -140.3f)
                curveToRelative(29.7f, -5.2f, 50.9f, -17.3f, 72.0f, -29.4f)
                close()
                moveTo(64.0f, 480.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                reflectiveCurveToRelative(28.7f, -64.0f, 64.0f, -64.0f)
                lineToRelative(48.0f, 0.0f)
                lineToRelative(0.0f, 128.0f)
                lineToRelative(-48.0f, 0.0f)
                close()
            }
        }
        .build()
        return _shoePrints!!
    }

private var _shoePrints: ImageVector? = null
