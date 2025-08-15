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

public val SolidGroup.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) {
            return _wheelchair!!
        }
        _wheelchair = Builder(name = "Wheelchair", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 40.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 112.0f, 0.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, -112.0f, 0.0f)
                close()
                moveTo(117.9f, 197.6f)
                lineToRelative(12.6f, 63.0f)
                curveToRelative(-38.6f, 12.4f, -66.5f, 48.7f, -66.5f, 91.4f)
                curveToRelative(0.0f, 53.0f, 43.0f, 96.0f, 96.0f, 96.0f)
                curveToRelative(35.6f, 0.0f, 66.7f, -19.4f, 83.3f, -48.2f)
                curveToRelative(2.3f, 0.1f, 4.6f, 0.2f, 7.0f, 0.2f)
                lineToRelative(4.1f, 0.0f)
                curveToRelative(1.0f, 0.0f, 2.1f, 0.0f, 3.1f, 0.0f)
                lineToRelative(55.2f, 0.0f)
                curveToRelative(-20.4f, 64.9f, -81.0f, 112.0f, -152.7f, 112.0f)
                curveToRelative(-88.4f, 0.0f, -160.0f, -71.6f, -160.0f, -160.0f)
                curveToRelative(0.0f, -73.8f, 50.0f, -135.9f, 117.9f, -154.4f)
                close()
                moveTo(266.5f, 169.5f)
                lineToRelative(23.7f, 118.5f)
                lineToRelative(60.5f, 0.0f)
                curveToRelative(33.3f, 0.0f, 63.2f, 20.7f, 74.9f, 51.9f)
                lineToRelative(25.5f, 68.0f)
                lineToRelative(18.7f, -6.2f)
                curveToRelative(16.8f, -5.6f, 34.9f, 3.5f, 40.5f, 20.2f)
                reflectiveCurveToRelative(-3.5f, 34.9f, -20.2f, 40.5f)
                lineToRelative(-48.0f, 16.0f)
                curveToRelative(-16.3f, 5.4f, -34.0f, -3.0f, -40.1f, -19.1f)
                lineToRelative(-36.3f, -96.9f)
                curveToRelative(-2.3f, -6.2f, -8.3f, -10.4f, -15.0f, -10.4f)
                lineToRelative(-86.1f, 0.0f)
                curveToRelative(-0.4f, 0.0f, -0.8f, 0.0f, -1.3f, 0.0f)
                lineToRelative(-13.1f, 0.0f)
                curveToRelative(-30.5f, 0.0f, -56.8f, -21.5f, -62.8f, -51.4f)
                lineTo(165.3f, 189.7f)
                curveToRelative(-6.4f, -31.9f, 18.0f, -61.7f, 50.6f, -61.7f)
                curveToRelative(24.6f, 0.0f, 45.8f, 17.4f, 50.6f, 41.5f)
                close()
            }
        }
        .build()
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null
