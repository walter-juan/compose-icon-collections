package com.woowla.compose.icon.collections.heroicons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.heroicons.heroicons.SolidGroup

public val SolidGroup.CurrencyPound: ImageVector
    get() {
        if (_currencyPound != null) {
            return _currencyPound!!
        }
        _currencyPound = Builder(name = "CurrencyPound", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 2.25f)
                curveTo(6.615f, 2.25f, 2.25f, 6.615f, 2.25f, 12.0f)
                curveTo(2.25f, 17.385f, 6.615f, 21.75f, 12.0f, 21.75f)
                curveTo(17.385f, 21.75f, 21.75f, 17.385f, 21.75f, 12.0f)
                curveTo(21.75f, 6.615f, 17.385f, 2.25f, 12.0f, 2.25f)
                close()
                moveTo(9.763f, 9.51f)
                curveTo(9.815f, 9.016f, 10.03f, 8.538f, 10.409f, 8.159f)
                curveTo(11.288f, 7.28f, 12.712f, 7.28f, 13.591f, 8.159f)
                curveTo(13.884f, 8.452f, 14.359f, 8.452f, 14.652f, 8.159f)
                curveTo(14.944f, 7.866f, 14.944f, 7.391f, 14.652f, 7.098f)
                curveTo(13.187f, 5.634f, 10.813f, 5.634f, 9.348f, 7.098f)
                curveTo(8.718f, 7.728f, 8.359f, 8.529f, 8.271f, 9.351f)
                curveTo(8.238f, 9.658f, 8.27f, 9.946f, 8.303f, 10.173f)
                lineTo(8.457f, 11.25f)
                horizontalLineTo(8.25f)
                curveTo(7.836f, 11.25f, 7.5f, 11.586f, 7.5f, 12.0f)
                curveTo(7.5f, 12.414f, 7.836f, 12.75f, 8.25f, 12.75f)
                horizontalLineTo(8.671f)
                lineTo(8.809f, 13.714f)
                curveTo(8.917f, 14.469f, 8.792f, 15.24f, 8.451f, 15.922f)
                lineTo(8.329f, 16.164f)
                curveTo(8.194f, 16.436f, 8.235f, 16.762f, 8.433f, 16.991f)
                curveTo(8.632f, 17.221f, 8.949f, 17.307f, 9.237f, 17.211f)
                lineTo(10.776f, 16.699f)
                curveTo(11.084f, 16.596f, 11.416f, 16.596f, 11.724f, 16.699f)
                lineTo(12.379f, 16.917f)
                curveTo(13.134f, 17.168f, 13.957f, 17.11f, 14.669f, 16.754f)
                lineTo(15.335f, 16.421f)
                curveTo(15.706f, 16.236f, 15.856f, 15.785f, 15.671f, 15.415f)
                curveTo(15.486f, 15.044f, 15.035f, 14.894f, 14.665f, 15.079f)
                lineTo(13.998f, 15.412f)
                curveTo(13.642f, 15.59f, 13.23f, 15.62f, 12.853f, 15.494f)
                lineTo(12.199f, 15.276f)
                curveTo(11.583f, 15.07f, 10.917f, 15.07f, 10.301f, 15.276f)
                lineTo(10.24f, 15.296f)
                curveTo(10.36f, 14.709f, 10.379f, 14.102f, 10.294f, 13.502f)
                lineTo(10.186f, 12.75f)
                horizontalLineTo(12.0f)
                curveTo(12.414f, 12.75f, 12.75f, 12.414f, 12.75f, 12.0f)
                curveTo(12.75f, 11.586f, 12.414f, 11.25f, 12.0f, 11.25f)
                horizontalLineTo(9.972f)
                lineTo(9.788f, 9.96f)
                curveTo(9.76f, 9.765f, 9.75f, 9.627f, 9.763f, 9.51f)
                close()
            }
        }
        .build()
        return _currencyPound!!
    }

private var _currencyPound: ImageVector? = null
