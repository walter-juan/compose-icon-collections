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

public val SolidGroup.PeopleRoof: ImageVector
    get() {
        if (_peopleRoof != null) {
            return _peopleRoof!!
        }
        _peopleRoof = Builder(name = "PeopleRoof", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(302.3f, -12.6f)
                curveToRelative(-9.0f, -4.5f, -19.6f, -4.5f, -28.6f, 0.0f)
                lineToRelative(-256.0f, 128.0f)
                curveTo(1.9f, 123.3f, -4.5f, 142.5f, 3.4f, 158.3f)
                reflectiveCurveToRelative(27.1f, 22.2f, 42.9f, 14.3f)
                lineTo(288.0f, 51.8f)
                lineTo(529.7f, 172.6f)
                curveToRelative(15.8f, 7.9f, 35.0f, 1.5f, 42.9f, -14.3f)
                reflectiveCurveToRelative(1.5f, -35.0f, -14.3f, -42.9f)
                lineToRelative(-256.0f, -128.0f)
                close()
                moveTo(288.0f, 272.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, 0.0f, -112.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, false, 0.0f, 112.0f)
                close()
                moveTo(288.0f, 320.0f)
                curveToRelative(-53.0f, 0.0f, -96.0f, 43.0f, -96.0f, 96.0f)
                lineToRelative(0.0f, 32.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineToRelative(128.0f, 0.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineToRelative(0.0f, -32.0f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                close()
                moveTo(160.0f, 256.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 96.0f, 0.0f)
                close()
                moveTo(512.0f, 256.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 96.0f, 0.0f)
                close()
                moveTo(112.0f, 336.0f)
                curveToRelative(-44.2f, 0.0f, -80.0f, 35.8f, -80.0f, 80.0f)
                lineToRelative(0.0f, 33.1f)
                curveToRelative(0.0f, 17.0f, 13.8f, 30.9f, 30.9f, 30.9f)
                lineToRelative(87.8f, 0.0f)
                curveToRelative(-4.3f, -9.8f, -6.7f, -20.6f, -6.7f, -32.0f)
                lineToRelative(0.0f, -48.0f)
                curveToRelative(0.0f, -18.4f, 3.5f, -36.0f, 9.8f, -52.2f)
                curveToRelative(-12.2f, -7.5f, -26.5f, -11.8f, -41.8f, -11.8f)
                close()
                moveTo(425.4f, 480.0f)
                lineToRelative(87.8f, 0.0f)
                curveToRelative(17.0f, 0.0f, 30.9f, -13.8f, 30.9f, -30.9f)
                lineToRelative(0.0f, -33.1f)
                curveToRelative(0.0f, -44.2f, -35.8f, -80.0f, -80.0f, -80.0f)
                curveToRelative(-15.3f, 0.0f, -29.6f, 4.3f, -41.8f, 11.8f)
                curveToRelative(6.3f, 16.2f, 9.8f, 33.8f, 9.8f, 52.2f)
                lineToRelative(0.0f, 48.0f)
                curveToRelative(0.0f, 11.4f, -2.4f, 22.2f, -6.7f, 32.0f)
                close()
            }
        }
        .build()
        return _peopleRoof!!
    }

private var _peopleRoof: ImageVector? = null
