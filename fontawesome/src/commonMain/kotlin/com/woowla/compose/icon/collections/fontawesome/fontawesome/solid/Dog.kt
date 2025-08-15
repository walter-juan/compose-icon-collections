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

public val SolidGroup.Dog: ImageVector
    get() {
        if (_dog != null) {
            return _dog!!
        }
        _dog = Builder(name = "Dog", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 112.0f)
                curveToRelative(16.6f, 0.0f, 30.2f, 12.6f, 31.8f, 28.7f)
                lineToRelative(0.3f, 6.6f)
                curveTo(65.8f, 163.4f, 79.4f, 176.0f, 96.0f, 176.0f)
                lineToRelative(179.1f, 0.0f)
                lineToRelative(140.9f, 60.4f)
                lineToRelative(0.0f, 243.6f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -131.3f)
                curveTo(296.0f, 361.0f, 268.8f, 368.0f, 240.0f, 368.0f)
                reflectiveCurveToRelative(-56.0f, -7.0f, -80.0f, -19.3f)
                lineTo(160.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineToRelative(-32.0f, 0.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineToRelative(0.0f, -245.6f)
                curveToRelative(-37.3f, -13.2f, -64.0f, -48.6f, -64.0f, -90.4f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(355.8f, -32.0f)
                curveToRelative(7.7f, 0.0f, 14.9f, 3.6f, 19.6f, 9.8f)
                lineTo(392.0f, 0.0f)
                lineTo(444.1f, 0.0f)
                curveToRelative(12.7f, 0.0f, 24.9f, 5.1f, 33.9f, 14.1f)
                lineTo(496.0f, 32.0f)
                lineTo(552.0f, 32.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                lineToRelative(0.0f, 24.0f)
                curveToRelative(0.0f, 44.2f, -35.8f, 80.0f, -80.0f, 80.0f)
                lineToRelative(-64.0f, 0.0f)
                lineToRelative(-7.0f, 28.0f)
                lineToRelative(-124.7f, -53.4f)
                lineToRelative(31.6f, -147.2f)
                curveTo(334.3f, -23.9f, 344.2f, -32.0f, 355.8f, -32.0f)
                close()
                moveTo(448.0f, 44.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, 0.0f, 40.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, 0.0f, -40.0f)
                close()
            }
        }
        .build()
        return _dog!!
    }

private var _dog: ImageVector? = null
