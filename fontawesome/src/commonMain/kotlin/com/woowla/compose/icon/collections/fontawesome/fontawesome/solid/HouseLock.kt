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

public val SolidGroup.HouseLock: ImageVector
    get() {
        if (_houseLock != null) {
            return _houseLock!!
        }
        _houseLock = Builder(name = "HouseLock", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 480.0f)
                curveToRelative(0.0f, 11.7f, 3.1f, 22.6f, 8.6f, 32.0f)
                lineToRelative(-0.6f, 0.0f)
                curveToRelative(-22.1f, 0.0f, -40.0f, -17.9f, -40.0f, -40.0f)
                lineToRelative(0.0f, -24.0f)
                lineToRelative(0.0f, -64.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineToRelative(-64.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(0.0f, 24.0f)
                curveToRelative(0.0f, 22.1f, -17.9f, 40.0f, -40.0f, 40.0f)
                lineToRelative(-24.0f, 0.0f)
                lineToRelative(-31.9f, 0.0f)
                curveToRelative(-1.5f, 0.0f, -3.0f, -0.1f, -4.5f, -0.2f)
                curveToRelative(-1.2f, 0.1f, -2.4f, 0.2f, -3.6f, 0.2f)
                lineToRelative(-16.0f, 0.0f)
                curveToRelative(-22.1f, 0.0f, -40.0f, -17.9f, -40.0f, -40.0f)
                lineToRelative(0.0f, -112.0f)
                curveToRelative(0.0f, -0.9f, 0.0f, -1.9f, 0.1f, -2.8f)
                lineToRelative(0.0f, -69.7f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-18.0f, 0.0f, -32.0f, -14.0f, -32.0f, -32.1f)
                curveToRelative(0.0f, -9.0f, 3.0f, -17.0f, 10.0f, -24.0f)
                lineTo(266.4f, 8.0f)
                curveToRelative(7.0f, -7.0f, 15.0f, -8.0f, 22.0f, -8.0f)
                reflectiveCurveToRelative(15.0f, 2.0f, 21.0f, 7.0f)
                lineTo(490.7f, 166.3f)
                curveTo(447.2f, 181.7f, 416.0f, 223.2f, 416.0f, 272.0f)
                lineToRelative(0.0f, 24.6f)
                curveToRelative(-19.1f, 11.1f, -32.0f, 31.7f, -32.0f, 55.4f)
                lineToRelative(0.0f, 128.0f)
                close()
                moveTo(528.0f, 240.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineToRelative(0.0f, 48.0f)
                lineToRelative(64.0f, 0.0f)
                lineToRelative(0.0f, -48.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(448.0f, 272.0f)
                curveToRelative(0.0f, -44.2f, 35.8f, -80.0f, 80.0f, -80.0f)
                reflectiveCurveToRelative(80.0f, 35.8f, 80.0f, 80.0f)
                lineToRelative(0.0f, 48.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineToRelative(0.0f, 128.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-160.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -128.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineToRelative(0.0f, -48.0f)
                close()
            }
        }
        .build()
        return _houseLock!!
    }

private var _houseLock: ImageVector? = null
