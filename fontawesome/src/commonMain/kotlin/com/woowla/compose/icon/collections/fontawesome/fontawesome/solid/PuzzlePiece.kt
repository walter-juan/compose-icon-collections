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

public val SolidGroup.PuzzlePiece: ImageVector
    get() {
        if (_puzzlePiece != null) {
            return _puzzlePiece!!
        }
        _puzzlePiece = Builder(name = "PuzzlePiece", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 0.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 21.5f, 64.0f, 48.0f)
                curveToRelative(0.0f, 10.4f, -4.4f, 20.0f, -12.0f, 27.9f)
                curveToRelative(-6.6f, 6.9f, -12.0f, 15.3f, -12.0f, 24.9f)
                curveToRelative(0.0f, 15.0f, 12.2f, 27.2f, 27.2f, 27.2f)
                lineToRelative(44.8f, 0.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                lineToRelative(0.0f, 44.8f)
                curveToRelative(0.0f, 15.0f, 12.2f, 27.2f, 27.2f, 27.2f)
                curveToRelative(9.5f, 0.0f, 18.0f, -5.4f, 24.9f, -12.0f)
                curveToRelative(7.9f, -7.5f, 17.5f, -12.0f, 27.9f, -12.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 28.7f, 48.0f, 64.0f)
                reflectiveCurveToRelative(-21.5f, 64.0f, -48.0f, 64.0f)
                curveToRelative(-10.4f, 0.0f, -20.1f, -4.4f, -27.9f, -12.0f)
                curveToRelative(-6.9f, -6.6f, -15.3f, -12.0f, -24.9f, -12.0f)
                curveToRelative(-15.0f, 0.0f, -27.2f, 12.2f, -27.2f, 27.2f)
                lineTo(384.0f, 464.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                lineToRelative(-56.8f, 0.0f)
                curveToRelative(-12.8f, 0.0f, -23.2f, -10.4f, -23.2f, -23.2f)
                curveToRelative(0.0f, -9.2f, 5.8f, -17.3f, 13.2f, -22.8f)
                curveToRelative(11.6f, -8.7f, 18.8f, -20.7f, 18.8f, -34.0f)
                curveToRelative(0.0f, -26.5f, -28.7f, -48.0f, -64.0f, -48.0f)
                reflectiveCurveToRelative(-64.0f, 21.5f, -64.0f, 48.0f)
                curveToRelative(0.0f, 13.3f, 7.2f, 25.3f, 18.8f, 34.0f)
                curveToRelative(7.4f, 5.5f, 13.2f, 13.5f, 13.2f, 22.8f)
                curveToRelative(0.0f, 12.8f, -10.4f, 23.2f, -23.2f, 23.2f)
                lineTo(48.0f, 512.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                lineTo(0.0f, 343.2f)
                curveToRelative(0.0f, -12.8f, 10.4f, -23.2f, 23.2f, -23.2f)
                curveToRelative(9.2f, 0.0f, 17.3f, 5.8f, 22.8f, 13.2f)
                curveToRelative(8.7f, 11.6f, 20.7f, 18.8f, 34.0f, 18.8f)
                curveToRelative(26.5f, 0.0f, 48.0f, -28.7f, 48.0f, -64.0f)
                reflectiveCurveToRelative(-21.5f, -64.0f, -48.0f, -64.0f)
                curveToRelative(-13.3f, 0.0f, -25.3f, 7.2f, -34.0f, 18.8f)
                curveToRelative(-5.5f, 7.4f, -13.5f, 13.2f, -22.8f, 13.2f)
                curveToRelative(-12.8f, 0.0f, -23.2f, -10.4f, -23.2f, -23.2f)
                lineTo(0.0f, 176.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                lineToRelative(108.8f, 0.0f)
                curveToRelative(15.0f, 0.0f, 27.2f, -12.2f, 27.2f, -27.2f)
                curveToRelative(0.0f, -9.5f, -5.4f, -18.0f, -12.0f, -24.9f)
                curveToRelative(-7.5f, -7.9f, -12.0f, -17.5f, -12.0f, -27.9f)
                curveToRelative(0.0f, -26.5f, 28.7f, -48.0f, 64.0f, -48.0f)
                close()
            }
        }
        .build()
        return _puzzlePiece!!
    }

private var _puzzlePiece: ImageVector? = null
