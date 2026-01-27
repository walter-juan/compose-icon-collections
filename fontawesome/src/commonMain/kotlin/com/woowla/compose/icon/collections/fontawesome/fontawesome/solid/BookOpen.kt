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

public val SolidGroup.BookOpen: ImageVector
    get() {
        if (_bookOpen != null) {
            return _bookOpen!!
        }
        _bookOpen = Builder(name = "BookOpen", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 141.3f)
                lineToRelative(0.0f, 309.3f)
                lineToRelative(0.5f, -0.2f)
                curveTo(311.1f, 427.7f, 369.7f, 416.0f, 428.8f, 416.0f)
                lineToRelative(19.2f, 0.0f)
                lineToRelative(0.0f, -320.0f)
                lineToRelative(-19.2f, 0.0f)
                curveToRelative(-42.2f, 0.0f, -84.1f, 8.4f, -123.1f, 24.6f)
                curveToRelative(-16.8f, 7.0f, -33.4f, 13.9f, -49.7f, 20.7f)
                close()
                moveTo(230.9f, 61.5f)
                lineTo(256.0f, 72.0f)
                lineTo(281.1f, 61.5f)
                curveTo(327.9f, 42.0f, 378.1f, 32.0f, 428.8f, 32.0f)
                lineTo(464.0f, 32.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                lineToRelative(0.0f, 352.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineToRelative(-35.2f, 0.0f)
                curveToRelative(-50.7f, 0.0f, -100.9f, 10.0f, -147.7f, 29.5f)
                lineToRelative(-12.8f, 5.3f)
                curveToRelative(-7.9f, 3.3f, -16.7f, 3.3f, -24.6f, 0.0f)
                lineToRelative(-12.8f, -5.3f)
                curveTo(184.1f, 490.0f, 133.9f, 480.0f, 83.2f, 480.0f)
                lineTo(48.0f, 480.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineTo(0.0f, 80.0f)
                curveTo(0.0f, 53.5f, 21.5f, 32.0f, 48.0f, 32.0f)
                lineToRelative(35.2f, 0.0f)
                curveToRelative(50.7f, 0.0f, 100.9f, 10.0f, 147.7f, 29.5f)
                close()
            }
        }
        .build()
        return _bookOpen!!
    }

private var _bookOpen: ImageVector? = null
