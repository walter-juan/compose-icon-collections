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

public val SolidGroup.Number6: ImageVector
    get() {
        if (_number6 != null) {
            return _number6!!
        }
        _number6 = Builder(name = "Number6", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-88.0f, 0.0f)
                curveToRelative(-48.6f, 0.0f, -88.0f, 39.4f, -88.0f, 88.0f)
                lineToRelative(0.0f, 32.2f)
                curveToRelative(22.9f, -15.3f, 50.4f, -24.2f, 80.0f, -24.2f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(79.5f, 0.0f, 144.0f, 64.5f, 144.0f, 144.0f)
                reflectiveCurveTo(287.5f, 480.0f, 208.0f, 480.0f)
                lineToRelative(-48.0f, 0.0f)
                curveTo(80.5f, 480.0f, 16.0f, 415.5f, 16.0f, 336.0f)
                lineToRelative(0.0f, -152.0f)
                curveTo(16.0f, 100.1f, 84.1f, 32.0f, 168.0f, 32.0f)
                lineToRelative(88.0f, 0.0f)
                close()
                moveTo(80.0f, 336.0f)
                curveToRelative(0.0f, 44.2f, 35.8f, 80.0f, 80.0f, 80.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(44.2f, 0.0f, 80.0f, -35.8f, 80.0f, -80.0f)
                reflectiveCurveToRelative(-35.8f, -80.0f, -80.0f, -80.0f)
                lineToRelative(-48.0f, 0.0f)
                curveToRelative(-44.2f, 0.0f, -80.0f, 35.8f, -80.0f, 80.0f)
                close()
            }
        }
        .build()
        return _number6!!
    }

private var _number6: ImageVector? = null
