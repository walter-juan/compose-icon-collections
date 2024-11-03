package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Hammer: ImageVector
    get() {
        if (_hammer != null) {
            return _hammer!!
        }
        _hammer = Builder(name = "Hammer", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.972f, 2.508f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.16f, -0.556f)
                lineToRelative(-0.178f, -0.129f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, -2.076f, -0.783f)
                curveTo(6.215f, 0.862f, 4.504f, 1.229f, 2.84f, 3.133f)
                horizontalLineTo(1.786f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, -0.354f, 0.147f)
                lineTo(0.146f, 4.567f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.0f, 0.706f)
                lineToRelative(2.571f, 2.579f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.708f, 0.0f)
                lineToRelative(1.286f, -1.29f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.146f, -0.353f)
                verticalLineTo(5.57f)
                lineToRelative(8.387f, 8.873f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 14.0f, 14.5f)
                lineToRelative(1.5f, -1.5f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.017f, -0.689f)
                lineToRelative(-9.129f, -8.63f)
                curveToRelative(0.747f, -0.456f, 1.772f, -0.839f, 3.112f, -0.839f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, false, 0.472f, -0.334f)
            }
        }
        .build()
        return _hammer!!
    }

private var _hammer: ImageVector? = null
