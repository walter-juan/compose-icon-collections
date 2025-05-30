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

public val SolidGroup.Bold: ImageVector
    get() {
        if (_bold != null) {
            return _bold!!
        }
        _bold = Builder(name = "Bold", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 64.0f)
                curveTo(0.0f, 46.3f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(48.0f, 0.0f)
                lineToRelative(16.0f, 0.0f)
                lineToRelative(128.0f, 0.0f)
                curveToRelative(70.7f, 0.0f, 128.0f, 57.3f, 128.0f, 128.0f)
                curveToRelative(0.0f, 31.3f, -11.3f, 60.1f, -30.0f, 82.3f)
                curveToRelative(37.1f, 22.4f, 62.0f, 63.1f, 62.0f, 109.7f)
                curveToRelative(0.0f, 70.7f, -57.3f, 128.0f, -128.0f, 128.0f)
                lineTo(96.0f, 480.0f)
                lineToRelative(-16.0f, 0.0f)
                lineToRelative(-48.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(16.0f, 0.0f)
                lineToRelative(0.0f, -160.0f)
                lineTo(48.0f, 96.0f)
                lineTo(32.0f, 96.0f)
                curveTo(14.3f, 96.0f, 0.0f, 81.7f, 0.0f, 64.0f)
                close()
                moveTo(224.0f, 224.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                reflectiveCurveToRelative(-28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(112.0f, 96.0f)
                lineToRelative(0.0f, 128.0f)
                lineToRelative(112.0f, 0.0f)
                close()
                moveTo(112.0f, 288.0f)
                lineToRelative(0.0f, 128.0f)
                lineToRelative(144.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                reflectiveCurveToRelative(-28.7f, -64.0f, -64.0f, -64.0f)
                lineToRelative(-32.0f, 0.0f)
                lineToRelative(-112.0f, 0.0f)
                close()
            }
        }
        .build()
        return _bold!!
    }

private var _bold: ImageVector? = null
