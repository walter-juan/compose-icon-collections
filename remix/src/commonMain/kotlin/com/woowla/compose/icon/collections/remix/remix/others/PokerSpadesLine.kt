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

public val OthersGroup.PokerSpadesLine: ImageVector
    get() {
        if (_pokerSpadesLine != null) {
            return _pokerSpadesLine!!
        }
        _pokerSpadesLine = Builder(name = "PokerSpadesLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.916f)
                curveTo(11.882f, 15.467f, 11.61f, 15.065f, 11.218f, 14.789f)
                curveTo(10.626f, 14.372f, 9.853f, 14.307f, 9.2f, 14.621f)
                curveTo(8.703f, 14.86f, 8.126f, 15.0f, 7.5f, 15.0f)
                curveTo(5.383f, 15.0f, 4.0f, 13.482f, 4.0f, 12.0f)
                curveTo(4.0f, 10.94f, 4.515f, 9.885f, 5.613f, 8.71f)
                curveTo(6.746f, 7.498f, 8.268f, 6.399f, 9.898f, 5.224f)
                curveTo(10.591f, 4.724f, 11.319f, 4.2f, 12.0f, 3.657f)
                curveTo(12.681f, 4.2f, 13.409f, 4.724f, 14.102f, 5.224f)
                curveTo(15.732f, 6.399f, 17.254f, 7.498f, 18.387f, 8.71f)
                curveTo(19.485f, 9.885f, 20.0f, 10.94f, 20.0f, 12.0f)
                curveTo(20.0f, 13.482f, 18.617f, 15.0f, 16.5f, 15.0f)
                curveTo(15.874f, 15.0f, 15.297f, 14.86f, 14.8f, 14.621f)
                curveTo(14.147f, 14.307f, 13.374f, 14.372f, 12.782f, 14.789f)
                curveTo(12.39f, 15.065f, 12.118f, 15.467f, 12.0f, 15.916f)
                close()
                moveTo(12.0f, 1.0f)
                curveTo(11.129f, 1.871f, 9.92f, 2.742f, 8.644f, 3.662f)
                curveTo(5.525f, 5.911f, 2.0f, 8.452f, 2.0f, 12.0f)
                curveTo(2.0f, 14.761f, 4.462f, 17.0f, 7.5f, 17.0f)
                curveTo(8.427f, 17.0f, 9.3f, 16.792f, 10.066f, 16.424f)
                curveTo(9.974f, 17.291f, 9.788f, 18.03f, 9.53f, 18.741f)
                curveTo(9.31f, 19.345f, 9.039f, 19.929f, 8.728f, 20.554f)
                curveTo(8.398f, 21.22f, 8.875f, 22.0f, 9.618f, 22.0f)
                horizontalLineTo(14.382f)
                curveTo(15.125f, 22.0f, 15.602f, 21.22f, 15.272f, 20.554f)
                curveTo(14.962f, 19.929f, 14.69f, 19.345f, 14.47f, 18.741f)
                curveTo(14.212f, 18.03f, 14.026f, 17.291f, 13.934f, 16.424f)
                curveTo(14.7f, 16.792f, 15.573f, 17.0f, 16.5f, 17.0f)
                curveTo(19.538f, 17.0f, 22.0f, 14.761f, 22.0f, 12.0f)
                curveTo(22.0f, 8.452f, 18.475f, 5.911f, 15.356f, 3.662f)
                curveTo(14.08f, 2.742f, 12.871f, 1.871f, 12.0f, 1.0f)
                close()
                moveTo(12.0f, 17.074f)
                curveTo(12.158f, 18.184f, 12.451f, 19.121f, 12.815f, 20.0f)
                horizontalLineTo(11.185f)
                curveTo(11.549f, 19.121f, 11.842f, 18.184f, 12.0f, 17.074f)
                close()
            }
        }
        .build()
        return _pokerSpadesLine!!
    }

private var _pokerSpadesLine: ImageVector? = null
