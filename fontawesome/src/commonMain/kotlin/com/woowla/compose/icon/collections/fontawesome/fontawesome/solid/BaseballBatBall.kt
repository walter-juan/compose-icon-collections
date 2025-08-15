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

public val SolidGroup.BaseballBatBall: ImageVector
    get() {
        if (_baseballBatBall != null) {
            return _baseballBatBall!!
        }
        _baseballBatBall = Builder(name = "BaseballBatBall", defaultWidth = 576.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.1f, 544.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 0.0f, -160.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 0.0f, 160.0f)
                close()
                moveTo(472.5f, -32.0f)
                curveToRelative(15.1f, 0.0f, 29.7f, 5.8f, 40.7f, 16.2f)
                lineToRelative(47.2f, 44.8f)
                curveToRelative(12.6f, 12.0f, 19.1f, 29.0f, 17.5f, 46.3f)
                curveToRelative(-1.2f, 13.3f, -7.0f, 25.8f, -16.5f, 35.2f)
                lineTo(363.1f, 309.0f)
                curveToRelative(-7.3f, 7.3f, -15.7f, 13.4f, -25.0f, 18.0f)
                lineTo(206.0f, 393.0f)
                curveToRelative(-9.2f, 4.6f, -17.7f, 10.7f, -25.0f, 18.0f)
                lineToRelative(-92.0f, 92.0f)
                lineToRelative(1.7f, 1.8f)
                curveToRelative(7.7f, 9.4f, 7.1f, 23.3f, -1.7f, 32.1f)
                reflectiveCurveToRelative(-22.7f, 9.3f, -32.1f, 1.7f)
                lineToRelative(-1.8f, -1.7f)
                lineToRelative(-48.0f, -48.0f)
                lineToRelative(-1.7f, -1.8f)
                curveToRelative(-7.7f, -9.4f, -7.1f, -23.3f, 1.7f, -32.1f)
                reflectiveCurveToRelative(22.7f, -9.3f, 32.1f, -1.7f)
                lineToRelative(1.8f, 1.7f)
                lineToRelative(92.0f, -92.0f)
                curveToRelative(7.3f, -7.3f, 13.4f, -15.7f, 18.0f, -25.0f)
                lineToRelative(66.1f, -132.1f)
                curveToRelative(4.6f, -9.2f, 10.7f, -17.7f, 18.0f, -25.0f)
                lineTo(430.8f, -14.7f)
                curveTo(441.9f, -25.8f, 456.9f, -32.0f, 472.5f, -32.0f)
                close()
            }
        }
        .build()
        return _baseballBatBall!!
    }

private var _baseballBatBall: ImageVector? = null
