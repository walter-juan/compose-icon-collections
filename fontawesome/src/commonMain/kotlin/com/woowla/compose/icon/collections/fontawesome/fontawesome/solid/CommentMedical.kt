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

public val SolidGroup.CommentMedical: ImageVector
    get() {
        if (_commentMedical != null) {
            return _commentMedical!!
        }
        _commentMedical = Builder(name = "CommentMedical", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 480.0f)
                curveToRelative(141.4f, 0.0f, 256.0f, -107.5f, 256.0f, -240.0f)
                reflectiveCurveTo(397.4f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveTo(0.0f, 107.5f, 0.0f, 240.0f)
                curveToRelative(0.0f, 54.3f, 19.2f, 104.3f, 51.6f, 144.5f)
                lineTo(2.8f, 476.8f)
                curveToRelative(-4.8f, 9.0f, -3.3f, 20.0f, 3.6f, 27.5f)
                reflectiveCurveToRelative(17.8f, 9.8f, 27.1f, 5.8f)
                lineToRelative(118.4f, -50.7f)
                curveTo(183.7f, 472.6f, 218.9f, 480.0f, 256.0f, 480.0f)
                close()
                moveTo(217.6f, 153.6f)
                curveToRelative(0.0f, -10.6f, 8.6f, -19.2f, 19.2f, -19.2f)
                lineToRelative(38.4f, 0.0f)
                curveToRelative(10.6f, 0.0f, 19.2f, 8.6f, 19.2f, 19.2f)
                lineToRelative(0.0f, 48.0f)
                lineToRelative(48.0f, 0.0f)
                curveToRelative(10.6f, 0.0f, 19.2f, 8.6f, 19.2f, 19.2f)
                lineToRelative(0.0f, 38.4f)
                curveToRelative(0.0f, 10.6f, -8.6f, 19.2f, -19.2f, 19.2f)
                lineToRelative(-48.0f, 0.0f)
                lineToRelative(0.0f, 48.0f)
                curveToRelative(0.0f, 10.6f, -8.6f, 19.2f, -19.2f, 19.2f)
                lineToRelative(-38.4f, 0.0f)
                curveToRelative(-10.6f, 0.0f, -19.2f, -8.6f, -19.2f, -19.2f)
                lineToRelative(0.0f, -48.0f)
                lineToRelative(-48.0f, 0.0f)
                curveToRelative(-10.6f, 0.0f, -19.2f, -8.6f, -19.2f, -19.2f)
                lineToRelative(0.0f, -38.4f)
                curveToRelative(0.0f, -10.6f, 8.6f, -19.2f, 19.2f, -19.2f)
                lineToRelative(48.0f, 0.0f)
                lineToRelative(0.0f, -48.0f)
                close()
            }
        }
        .build()
        return _commentMedical!!
    }

private var _commentMedical: ImageVector? = null
