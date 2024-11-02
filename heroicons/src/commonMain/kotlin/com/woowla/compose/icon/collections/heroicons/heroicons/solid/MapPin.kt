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

public val SolidGroup.MapPin: ImageVector
    get() {
        if (_mapPin != null) {
            return _mapPin!!
        }
        _mapPin = Builder(name = "MapPin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF0F172A)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.54f, 22.351f)
                curveTo(11.57f, 22.368f, 11.594f, 22.382f, 11.611f, 22.392f)
                lineTo(11.638f, 22.407f)
                curveTo(11.861f, 22.529f, 12.138f, 22.528f, 12.361f, 22.407f)
                lineTo(12.389f, 22.392f)
                curveTo(12.406f, 22.382f, 12.43f, 22.368f, 12.46f, 22.351f)
                curveTo(12.521f, 22.316f, 12.607f, 22.265f, 12.715f, 22.198f)
                curveTo(12.932f, 22.065f, 13.239f, 21.868f, 13.605f, 21.609f)
                curveTo(14.335f, 21.093f, 15.31f, 20.327f, 16.287f, 19.327f)
                curveTo(18.231f, 17.337f, 20.25f, 14.346f, 20.25f, 10.5f)
                curveTo(20.25f, 5.944f, 16.556f, 2.25f, 12.0f, 2.25f)
                curveTo(7.444f, 2.25f, 3.75f, 5.944f, 3.75f, 10.5f)
                curveTo(3.75f, 14.346f, 5.769f, 17.337f, 7.713f, 19.327f)
                curveTo(8.69f, 20.327f, 9.665f, 21.093f, 10.395f, 21.609f)
                curveTo(10.761f, 21.868f, 11.068f, 22.065f, 11.285f, 22.198f)
                curveTo(11.393f, 22.265f, 11.479f, 22.316f, 11.54f, 22.351f)
                close()
                moveTo(12.0f, 13.5f)
                curveTo(13.657f, 13.5f, 15.0f, 12.157f, 15.0f, 10.5f)
                curveTo(15.0f, 8.843f, 13.657f, 7.5f, 12.0f, 7.5f)
                curveTo(10.343f, 7.5f, 9.0f, 8.843f, 9.0f, 10.5f)
                curveTo(9.0f, 12.157f, 10.343f, 13.5f, 12.0f, 13.5f)
                close()
            }
        }
        .build()
        return _mapPin!!
    }

private var _mapPin: ImageVector? = null
