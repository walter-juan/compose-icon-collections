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

public val SolidGroup.Phone: ImageVector
    get() {
        if (_phone != null) {
            return _phone!!
        }
        _phone = Builder(name = "Phone", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.2f, 25.0f)
                curveTo(152.3f, 6.1f, 131.7f, -3.9f, 112.1f, 1.4f)
                lineToRelative(-5.5f, 1.5f)
                curveToRelative(-64.6f, 17.6f, -119.8f, 80.2f, -103.7f, 156.4f)
                curveToRelative(37.1f, 175.0f, 174.8f, 312.7f, 349.8f, 349.8f)
                curveToRelative(76.3f, 16.2f, 138.8f, -39.1f, 156.4f, -103.7f)
                lineToRelative(1.5f, -5.5f)
                curveToRelative(5.4f, -19.7f, -4.7f, -40.3f, -23.5f, -48.1f)
                lineToRelative(-97.3f, -40.5f)
                curveToRelative(-16.5f, -6.9f, -35.6f, -2.1f, -47.0f, 11.8f)
                lineToRelative(-38.6f, 47.2f)
                curveTo(233.9f, 335.4f, 177.3f, 277.0f, 144.8f, 205.3f)
                lineTo(189.0f, 169.3f)
                curveToRelative(13.9f, -11.3f, 18.6f, -30.4f, 11.8f, -47.0f)
                lineTo(160.2f, 25.0f)
                close()
            }
        }
        .build()
        return _phone!!
    }

private var _phone: ImageVector? = null
