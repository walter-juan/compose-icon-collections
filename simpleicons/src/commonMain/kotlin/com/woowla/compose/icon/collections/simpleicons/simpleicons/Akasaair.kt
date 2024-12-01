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

public val Simpleicons.Akasaair: ImageVector
    get() {
        if (_akasaair != null) {
            return _akasaair!!
        }
        _akasaair = Builder(name = "Akasaair", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.731f, 1.801f)
                curveToRelative(-2.297f, 0.0f, -3.27f, 0.731f, -4.165f, 2.382f)
                lineToRelative(-0.629f, 1.116f)
                arcToRelative(3.226f, 3.226f, 0.0f, false, false, -0.529f, 1.483f)
                curveToRelative(0.026f, 0.43f, 0.166f, 0.844f, 0.406f, 1.201f)
                lineToRelative(5.002f, 8.944f)
                curveToRelative(1.789f, 3.197f, 4.001f, 4.986f, 8.764f, 4.986f)
                curveToRelative(0.407f, 0.0f, 0.508f, -0.243f, 0.344f, -0.529f)
                lineTo(17.437f, 9.793f)
                curveTo(16.14f, 7.454f, 15.69f, 5.766f, 15.69f, 4.548f)
                arcToRelative(3.532f, 3.532f, 0.0f, false, true, 0.814f, -2.425f)
                curveToRelative(0.122f, -0.138f, 0.101f, -0.323f, -0.142f, -0.323f)
                close()
                moveTo(7.812f, 8.856f)
                curveToRelative(-0.122f, 0.0f, -0.201f, 0.084f, -0.323f, 0.285f)
                lineTo(0.079f, 21.711f)
                arcToRelative(0.393f, 0.393f, 0.0f, false, false, -0.079f, 0.244f)
                curveToRelative(0.0f, 0.243f, 0.386f, 0.244f, 0.487f, 0.244f)
                curveToRelative(5.335f, 0.0f, 9.041f, -3.255f, 9.041f, -7.971f)
                arcToRelative(10.056f, 10.056f, 0.0f, false, false, -1.409f, -5.107f)
                curveToRelative(-0.101f, -0.159f, -0.185f, -0.266f, -0.306f, -0.266f)
                close()
            }
        }
        .build()
        return _akasaair!!
    }

private var _akasaair: ImageVector? = null
