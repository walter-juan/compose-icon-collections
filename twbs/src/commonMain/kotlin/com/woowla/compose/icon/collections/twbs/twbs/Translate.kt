package com.woowla.compose.icon.collections.twbs.twbs

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.twbs.Twbs

public val Twbs.Translate: ImageVector
    get() {
        if (_translate != null) {
            return _translate!!
        }
        _translate = Builder(name = "Translate", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.545f, 6.714f)
                lineTo(4.11f, 8.0f)
                lineTo(3.0f, 8.0f)
                lineToRelative(1.862f, -5.0f)
                horizontalLineToRelative(1.284f)
                lineTo(8.0f, 8.0f)
                lineTo(6.833f, 8.0f)
                lineToRelative(-0.435f, -1.286f)
                close()
                moveTo(6.179f, 5.978f)
                lineTo(5.5f, 3.956f)
                horizontalLineToRelative(-0.049f)
                lineToRelative(-0.679f, 2.022f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(7.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-3.0f)
                lineTo(2.0f, 11.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                close()
                moveTo(2.0f, 1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                verticalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, 1.0f)
                horizontalLineToRelative(7.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.0f, -1.0f)
                lineTo(10.0f, 2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(9.138f, 10.995f)
                quadToRelative(0.289f, 0.451f, 0.63f, 0.846f)
                curveToRelative(-0.748f, 0.575f, -1.673f, 1.001f, -2.768f, 1.292f)
                curveToRelative(0.178f, 0.217f, 0.451f, 0.635f, 0.555f, 0.867f)
                curveToRelative(1.125f, -0.359f, 2.08f, -0.844f, 2.886f, -1.494f)
                curveToRelative(0.777f, 0.665f, 1.739f, 1.165f, 2.93f, 1.472f)
                curveToRelative(0.133f, -0.254f, 0.414f, -0.673f, 0.629f, -0.89f)
                curveToRelative(-1.125f, -0.253f, -2.057f, -0.694f, -2.82f, -1.284f)
                curveToRelative(0.681f, -0.747f, 1.222f, -1.651f, 1.621f, -2.757f)
                lineTo(14.0f, 9.047f)
                lineTo(14.0f, 8.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.047f)
                horizontalLineToRelative(0.765f)
                curveToRelative(-0.318f, 0.844f, -0.74f, 1.546f, -1.272f, 2.13f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.415f, -0.492f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.94f, 0.31f)
            }
        }
        .build()
        return _translate!!
    }

private var _translate: ImageVector? = null
