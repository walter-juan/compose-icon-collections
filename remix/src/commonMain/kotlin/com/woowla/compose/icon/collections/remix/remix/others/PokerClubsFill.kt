package com.woowla.compose.icon.collections.remix.remix.others

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.OthersGroup

public val OthersGroup.PokerClubsFill: ImageVector
    get() {
        if (_pokerClubsFill != null) {
            return _pokerClubsFill!!
        }
        _pokerClubsFill = Builder(name = "PokerClubsFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.775f, 11.039f)
                curveTo(14.933f, 9.267f, 16.0f, 7.633f, 16.0f, 6.0f)
                curveTo(16.0f, 3.791f, 14.209f, 2.0f, 12.0f, 2.0f)
                curveTo(9.791f, 2.0f, 8.0f, 3.791f, 8.0f, 6.0f)
                curveTo(8.0f, 7.633f, 9.067f, 9.267f, 10.225f, 11.039f)
                lineTo(10.226f, 11.04f)
                curveTo(10.304f, 11.159f, 10.382f, 11.279f, 10.46f, 11.399f)
                curveTo(10.17f, 11.179f, 9.903f, 10.97f, 9.652f, 10.773f)
                curveTo(8.276f, 9.697f, 7.386f, 9.0f, 6.0f, 9.0f)
                curveTo(3.791f, 9.0f, 2.0f, 10.791f, 2.0f, 13.0f)
                curveTo(2.0f, 15.209f, 3.791f, 17.0f, 6.0f, 17.0f)
                curveTo(7.633f, 17.0f, 9.267f, 15.933f, 11.039f, 14.775f)
                lineTo(11.07f, 14.755f)
                curveTo(10.977f, 17.036f, 10.112f, 18.438f, 9.157f, 19.985f)
                lineTo(9.157f, 19.985f)
                lineTo(9.157f, 19.985f)
                curveTo(9.035f, 20.183f, 8.912f, 20.383f, 8.788f, 20.587f)
                curveTo(8.404f, 21.223f, 8.875f, 22.0f, 9.618f, 22.0f)
                horizontalLineTo(14.382f)
                curveTo(15.125f, 22.0f, 15.596f, 21.223f, 15.212f, 20.587f)
                curveTo(15.088f, 20.383f, 14.965f, 20.183f, 14.843f, 19.985f)
                lineTo(14.843f, 19.985f)
                lineTo(14.843f, 19.985f)
                curveTo(13.888f, 18.438f, 13.023f, 17.036f, 12.93f, 14.755f)
                curveTo(12.94f, 14.761f, 12.95f, 14.768f, 12.961f, 14.775f)
                curveTo(14.733f, 15.933f, 16.367f, 17.0f, 18.0f, 17.0f)
                curveTo(20.209f, 17.0f, 22.0f, 15.209f, 22.0f, 13.0f)
                curveTo(22.0f, 10.791f, 20.209f, 9.0f, 18.0f, 9.0f)
                curveTo(16.614f, 9.0f, 15.724f, 9.697f, 14.348f, 10.773f)
                curveTo(14.097f, 10.97f, 13.83f, 11.179f, 13.54f, 11.399f)
                curveTo(13.619f, 11.278f, 13.697f, 11.158f, 13.775f, 11.039f)
                close()
            }
        }
        .build()
        return _pokerClubsFill!!
    }

private var _pokerClubsFill: ImageVector? = null
