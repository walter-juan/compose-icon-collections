package com.woowla.compose.icon.collections.simpleicons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.simpleicons.Simpleicons

public val Simpleicons.Googledisplayandvideo360: ImageVector
    get() {
        if (_googledisplayandvideo360 != null) {
            return _googledisplayandvideo360!!
        }
        _googledisplayandvideo360 = Builder(name = "Googledisplayandvideo360", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.421f, 0.01f)
                arcToRelative(2.947f, 2.947f, 0.0f, false, false, -2.828f, 1.52f)
                arcToRelative(2.967f, 2.967f, 0.0f, false, false, 1.094f, 4.076f)
                lineToRelative(10.6f, 6.064f)
                lineToRelative(4.79f, -2.672f)
                arcToRelative(3.546f, 3.546f, 0.0f, false, true, 1.811f, -0.443f)
                lineTo(5.701f, 0.424f)
                arcTo(2.947f, 2.947f, 0.0f, false, false, 4.42f, 0.01f)
                close()
                moveTo(1.164f, 4.768f)
                verticalLineToRelative(14.484f)
                arcToRelative(3.474f, 3.474f, 0.0f, false, true, 2.972f, -1.687f)
                arcToRelative(3.47f, 3.47f, 0.0f, false, true, 2.961f, 1.672f)
                lineToRelative(0.004f, -10.53f)
                lineTo(2.44f, 6.04f)
                arcToRelative(3.433f, 3.433f, 0.0f, false, true, -1.275f, -1.271f)
                close()
                moveTo(19.584f, 9.057f)
                arcToRelative(3.08f, 3.08f, 0.0f, false, false, -1.264f, 0.379f)
                lineTo(7.6f, 15.414f)
                curveToRelative(0.003f, 1.873f, -0.011f, 3.745f, 0.003f, 5.617f)
                curveToRelative(0.0f, 0.4f, -0.072f, 0.988f, -0.396f, 1.606f)
                lineToRelative(12.548f, -7.227f)
                lineToRelative(1.487f, -0.83f)
                arcToRelative(2.978f, 2.978f, 0.0f, false, false, 1.463f, -3.511f)
                arcToRelative(3.08f, 3.08f, 0.0f, false, false, -3.121f, -2.012f)
                close()
                moveTo(4.136f, 18.065f)
                arcTo(2.967f, 2.967f, 0.0f, true, false, 4.134f, 24.0f)
                arcToRelative(2.967f, 2.967f, 0.0f, false, false, 0.002f, -5.935f)
                close()
            }
        }
        .build()
        return _googledisplayandvideo360!!
    }

private var _googledisplayandvideo360: ImageVector? = null
