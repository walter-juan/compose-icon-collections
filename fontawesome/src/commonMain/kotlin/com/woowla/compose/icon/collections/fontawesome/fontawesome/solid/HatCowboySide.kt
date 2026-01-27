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

public val SolidGroup.HatCowboySide: ImageVector
    get() {
        if (_hatCowboySide != null) {
            return _hatCowboySide!!
        }
        _hatCowboySide = Builder(name = "HatCowboySide", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(640.0f, 388.3f)
                curveToRelative(0.0f, 16.9f, -7.1f, 32.2f, -18.4f, 43.1f)
                lineToRelative(-35.0f, -23.3f)
                lineToRelative(-292.7f, -195.1f)
                curveToRelative(-36.1f, -24.1f, -78.6f, -36.9f, -122.0f, -36.9f)
                lineToRelative(-3.9f, 0.0f)
                curveToRelative(-2.7f, 0.0f, -5.4f, 0.0f, -8.0f, 0.1f)
                lineToRelative(22.2f, -100.0f)
                curveToRelative(5.7f, -25.8f, 28.6f, -44.1f, 55.0f, -44.1f)
                curveToRelative(12.2f, 0.0f, 24.1f, 4.0f, 33.8f, 11.3f)
                lineToRelative(4.7f, 3.5f)
                curveToRelative(26.3f, 19.7f, 62.4f, 19.7f, 88.6f, 0.0f)
                lineToRelative(4.7f, -3.5f)
                curveToRelative(9.8f, -7.3f, 21.6f, -11.3f, 33.8f, -11.3f)
                curveToRelative(26.4f, 0.0f, 49.3f, 18.3f, 55.0f, 44.1f)
                lineToRelative(33.0f, 148.5f)
                curveTo(574.5f, 232.3f, 640.0f, 302.6f, 640.0f, 388.3f)
                close()
                moveTo(171.9f, 224.0f)
                curveToRelative(33.9f, 0.0f, 67.1f, 10.0f, 95.4f, 28.9f)
                lineTo(560.0f, 448.0f)
                lineTo(56.0f, 448.0f)
                curveToRelative(-30.9f, 0.0f, -56.0f, -25.1f, -56.0f, -56.0f)
                curveToRelative(0.0f, -92.8f, 75.2f, -168.0f, 168.0f, -168.0f)
                lineToRelative(3.9f, 0.0f)
                close()
            }
        }
        .build()
        return _hatCowboySide!!
    }

private var _hatCowboySide: ImageVector? = null
