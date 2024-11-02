package com.woowla.compose.icon.collections.fontawesome.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.fontawesome.fontawesome.RegularGroup

public val RegularGroup.CircleDown: ImageVector
    get() {
        if (_circleDown != null) {
            return _circleDown!!
        }
        _circleDown = Builder(name = "CircleDown", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 464.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, true, 0.0f, -416.0f)
                arcToRelative(208.0f, 208.0f, 0.0f, true, true, 0.0f, 416.0f)
                close()
                moveTo(256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, false, 256.0f, 0.0f)
                close()
                moveTo(128.0f, 256.0f)
                lineToRelative(0.0f, 32.0f)
                lineTo(256.0f, 416.0f)
                lineTo(384.0f, 288.0f)
                lineToRelative(0.0f, -32.0f)
                lineToRelative(-80.0f, 0.0f)
                lineToRelative(0.0f, -128.0f)
                lineToRelative(-96.0f, 0.0f)
                lineToRelative(0.0f, 128.0f)
                lineToRelative(-80.0f, 0.0f)
                close()
            }
        }
        .build()
        return _circleDown!!
    }

private var _circleDown: ImageVector? = null