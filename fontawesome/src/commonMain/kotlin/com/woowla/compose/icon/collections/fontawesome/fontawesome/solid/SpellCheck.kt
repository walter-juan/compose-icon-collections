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

public val SolidGroup.SpellCheck: ImageVector
    get() {
        if (_spellCheck != null) {
            return _spellCheck!!
        }
        _spellCheck = Builder(name = "SpellCheck", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 32.0f)
                curveToRelative(-48.6f, 0.0f, -88.0f, 39.4f, -88.0f, 88.0f)
                lineToRelative(0.0f, 168.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -168.0f)
                curveToRelative(0.0f, -48.6f, -39.4f, -88.0f, -88.0f, -88.0f)
                lineToRelative(-16.0f, 0.0f)
                close()
                moveTo(160.0f, 160.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(0.0f, -40.0f)
                curveToRelative(0.0f, -13.3f, 10.7f, -24.0f, 24.0f, -24.0f)
                lineToRelative(16.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                lineToRelative(0.0f, 40.0f)
                close()
                moveTo(304.0f, 32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 224.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(72.0f, 0.0f)
                curveToRelative(48.6f, 0.0f, 88.0f, -39.4f, 88.0f, -88.0f)
                curveToRelative(0.0f, -23.6f, -9.3f, -45.0f, -24.4f, -60.8f)
                curveToRelative(10.3f, -14.4f, 16.4f, -32.1f, 16.4f, -51.2f)
                curveToRelative(0.0f, -48.6f, -39.4f, -88.0f, -88.0f, -88.0f)
                lineToRelative(-64.0f, 0.0f)
                close()
                moveTo(368.0f, 144.0f)
                lineToRelative(-32.0f, 0.0f)
                lineToRelative(0.0f, -48.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                close()
                moveTo(336.0f, 256.0f)
                lineToRelative(0.0f, -48.0f)
                lineToRelative(40.0f, 0.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineToRelative(-40.0f, 0.0f)
                close()
                moveTo(569.0f, 340.0f)
                curveToRelative(11.0f, -13.8f, 8.8f, -33.9f, -5.0f, -45.0f)
                reflectiveCurveToRelative(-33.9f, -8.8f, -45.0f, 5.0f)
                lineToRelative(-105.7f, 132.1f)
                lineToRelative(-38.7f, -38.7f)
                curveToRelative(-12.5f, -12.5f, -32.8f, -12.5f, -45.3f, 0.0f)
                reflectiveCurveToRelative(-12.5f, 32.8f, 0.0f, 45.3f)
                lineToRelative(64.0f, 64.0f)
                curveToRelative(6.4f, 6.4f, 15.3f, 9.8f, 24.4f, 9.3f)
                reflectiveCurveToRelative(17.5f, -4.9f, 23.2f, -12.0f)
                lineTo(569.0f, 340.0f)
                close()
            }
        }
        .build()
        return _spellCheck!!
    }

private var _spellCheck: ImageVector? = null
