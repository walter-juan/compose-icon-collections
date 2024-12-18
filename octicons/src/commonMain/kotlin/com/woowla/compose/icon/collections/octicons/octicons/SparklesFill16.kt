package com.woowla.compose.icon.collections.octicons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.octicons.Octicons

public val Octicons.SparklesFill16: ImageVector
    get() {
        if (_sparklesFill16 != null) {
            return _sparklesFill16!!
        }
        _sparklesFill16 = Builder(name = "SparklesFill16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.6f, 2.279f)
                arcToRelative(0.426f, 0.426f, 0.0f, false, true, 0.8f, 0.0f)
                lineToRelative(0.407f, 1.112f)
                arcToRelative(6.386f, 6.386f, 0.0f, false, false, 3.802f, 3.802f)
                lineToRelative(1.112f, 0.407f)
                arcToRelative(0.426f, 0.426f, 0.0f, false, true, 0.0f, 0.8f)
                lineToRelative(-1.112f, 0.407f)
                arcToRelative(6.386f, 6.386f, 0.0f, false, false, -3.802f, 3.802f)
                lineToRelative(-0.407f, 1.112f)
                arcToRelative(0.426f, 0.426f, 0.0f, false, true, -0.8f, 0.0f)
                lineToRelative(-0.407f, -1.112f)
                arcToRelative(6.386f, 6.386f, 0.0f, false, false, -3.802f, -3.802f)
                lineTo(4.279f, 8.4f)
                arcToRelative(0.426f, 0.426f, 0.0f, false, true, 0.0f, -0.8f)
                lineToRelative(1.112f, -0.407f)
                arcToRelative(6.386f, 6.386f, 0.0f, false, false, 3.802f, -3.802f)
                lineTo(9.6f, 2.279f)
                close()
                moveTo(5.333f, 11.116f)
                arcToRelative(0.178f, 0.178f, 0.0f, false, true, 0.334f, 0.0f)
                lineToRelative(0.169f, 0.464f)
                arcToRelative(2.662f, 2.662f, 0.0f, false, false, 1.584f, 1.584f)
                lineToRelative(0.464f, 0.169f)
                arcToRelative(0.178f, 0.178f, 0.0f, false, true, 0.0f, 0.334f)
                lineToRelative(-0.464f, 0.169f)
                arcToRelative(2.662f, 2.662f, 0.0f, false, false, -1.584f, 1.584f)
                lineToRelative(-0.169f, 0.464f)
                arcToRelative(0.178f, 0.178f, 0.0f, false, true, -0.334f, 0.0f)
                lineToRelative(-0.169f, -0.464f)
                arcToRelative(2.662f, 2.662f, 0.0f, false, false, -1.584f, -1.584f)
                lineToRelative(-0.464f, -0.169f)
                arcToRelative(0.178f, 0.178f, 0.0f, false, true, 0.0f, -0.334f)
                lineToRelative(0.464f, -0.169f)
                arcToRelative(2.662f, 2.662f, 0.0f, false, false, 1.584f, -1.584f)
                lineToRelative(0.169f, -0.464f)
                close()
                moveTo(2.8f, 0.14f)
                arcToRelative(0.213f, 0.213f, 0.0f, false, true, 0.4f, 0.0f)
                lineToRelative(0.203f, 0.556f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, false, 1.901f, 1.901f)
                lineToRelative(0.556f, 0.203f)
                arcToRelative(0.213f, 0.213f, 0.0f, false, true, 0.0f, 0.4f)
                lineToRelative(-0.556f, 0.203f)
                arcToRelative(3.2f, 3.2f, 0.0f, false, false, -1.901f, 1.901f)
                lineTo(3.2f, 5.86f)
                arcToRelative(0.213f, 0.213f, 0.0f, false, true, -0.4f, 0.0f)
                lineToRelative(-0.203f, -0.556f)
                arcTo(3.2f, 3.2f, 0.0f, false, false, 0.696f, 3.403f)
                lineTo(0.14f, 3.2f)
                arcToRelative(0.213f, 0.213f, 0.0f, false, true, 0.0f, -0.4f)
                lineToRelative(0.556f, -0.203f)
                arcTo(3.2f, 3.2f, 0.0f, false, false, 2.597f, 0.696f)
                lineTo(2.8f, 0.14f)
                close()
            }
        }
        .build()
        return _sparklesFill16!!
    }

private var _sparklesFill16: ImageVector? = null
