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

public val Simpleicons.Remedyentertainment: ImageVector
    get() {
        if (_remedyentertainment != null) {
            return _remedyentertainment!!
        }
        _remedyentertainment = Builder(name = "Remedyentertainment", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.717f, 5.245f)
                verticalLineToRelative(6.613f)
                arcToRelative(3.309f, 3.309f, 0.0f, false, false, 3.306f, -3.307f)
                arcToRelative(3.31f, 3.31f, 0.0f, false, false, -3.306f, -3.306f)
                close()
                moveTo(9.123f, 5.245f)
                horizontalLineToRelative(-3.45f)
                verticalLineToRelative(6.613f)
                horizontalLineToRelative(3.455f)
                arcToRelative(3.309f, 3.309f, 0.0f, false, false, 3.306f, -3.307f)
                arcToRelative(3.312f, 3.312f, 0.0f, false, false, -3.311f, -3.306f)
                close()
                moveTo(20.571f, 15.16f)
                verticalLineToRelative(-1.507f)
                arcToRelative(8.578f, 8.578f, 0.0f, false, true, -2.714f, 2.379f)
                lineToRelative(2.714f, 4.792f)
                verticalLineToRelative(-2.878f)
                lineTo(24.0f, 24.0f)
                horizontalLineToRelative(-7.574f)
                lineToRelative(-2.709f, -4.789f)
                lineTo(13.717f, 24.0f)
                horizontalLineToRelative(-1.656f)
                lineToRelative(-3.907f, -6.897f)
                lineTo(5.673f, 17.103f)
                lineTo(5.673f, 24.0f)
                lineTo(0.0f, 24.0f)
                lineTo(0.0f, 0.0f)
                horizontalLineToRelative(9.123f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, 4.589f, 1.337f)
                lineTo(13.712f, 0.0f)
                arcToRelative(8.551f, 8.551f, 0.0f, false, true, 6.859f, 3.441f)
                lineTo(20.571f, 1.939f)
                arcToRelative(8.527f, 8.527f, 0.0f, false, true, 3.133f, 6.612f)
                arcToRelative(8.516f, 8.516f, 0.0f, false, true, -3.133f, 6.609f)
                close()
            }
        }
        .build()
        return _remedyentertainment!!
    }

private var _remedyentertainment: ImageVector? = null
