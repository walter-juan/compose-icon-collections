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

public val SolidGroup.Cross: ImageVector
    get() {
        if (_cross != null) {
            return _cross!!
        }
        _cross = Builder(name = "Cross", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                lineToRelative(0.0f, 80.0f)
                lineToRelative(-80.0f, 0.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, 21.5f, -48.0f, 48.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                lineToRelative(80.0f, 0.0f)
                lineToRelative(0.0f, 208.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                lineToRelative(32.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineToRelative(0.0f, -208.0f)
                lineToRelative(80.0f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                lineToRelative(-80.0f, 0.0f)
                lineToRelative(0.0f, -80.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                lineTo(176.0f, 0.0f)
                close()
            }
        }
        .build()
        return _cross!!
    }

private var _cross: ImageVector? = null
