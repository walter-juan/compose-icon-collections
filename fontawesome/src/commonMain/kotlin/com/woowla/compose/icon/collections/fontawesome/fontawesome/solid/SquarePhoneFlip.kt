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

public val SolidGroup.SquarePhoneFlip: ImageVector
    get() {
        if (_squarePhoneFlip != null) {
            return _squarePhoneFlip!!
        }
        _squarePhoneFlip = Builder(name = "SquarePhoneFlip", defaultWidth = 448.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 32.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineToRelative(0.0f, 320.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 480.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 96.0f)
                curveTo(0.0f, 60.7f, 28.7f, 32.0f, 64.0f, 32.0f)
                lineToRelative(320.0f, 0.0f)
                close()
                moveTo(293.3f, 128.7f)
                curveToRelative(-9.7f, -2.6f, -19.9f, 2.3f, -23.7f, 11.6f)
                lineToRelative(-20.0f, 48.0f)
                curveToRelative(-3.4f, 8.2f, -1.0f, 17.6f, 5.8f, 23.2f)
                lineTo(280.0f, 231.7f)
                curveToRelative(-16.6f, 35.2f, -45.1f, 63.7f, -80.3f, 80.3f)
                lineToRelative(-20.2f, -24.7f)
                curveToRelative(-5.6f, -6.8f, -15.0f, -9.2f, -23.2f, -5.8f)
                lineToRelative(-48.0f, 20.0f)
                curveToRelative(-9.3f, 3.9f, -14.2f, 14.0f, -11.6f, 23.7f)
                lineToRelative(12.0f, 44.0f)
                curveTo(111.1f, 378.0f, 119.0f, 384.0f, 128.0f, 384.0f)
                curveToRelative(123.7f, 0.0f, 224.0f, -100.3f, 224.0f, -224.0f)
                curveToRelative(0.0f, -9.0f, -6.0f, -16.9f, -14.7f, -19.3f)
                lineToRelative(-44.0f, -12.0f)
                close()
            }
        }
        .build()
        return _squarePhoneFlip!!
    }

private var _squarePhoneFlip: ImageVector? = null
