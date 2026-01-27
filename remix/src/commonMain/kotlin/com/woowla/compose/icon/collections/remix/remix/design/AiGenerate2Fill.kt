package com.woowla.compose.icon.collections.remix.remix.design

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.woowla.compose.icon.collections.remix.remix.DesignGroup

public val DesignGroup.AiGenerate2Fill: ImageVector
    get() {
        if (_aiGenerate2Fill != null) {
            return _aiGenerate2Fill!!
        }
        _aiGenerate2Fill = Builder(name = "AiGenerate2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 3.0f)
                curveTo(20.209f, 3.0f, 22.0f, 4.791f, 22.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(22.0f, 19.209f, 20.209f, 21.0f, 18.0f, 21.0f)
                horizontalLineTo(6.0f)
                curveTo(3.791f, 21.0f, 2.0f, 19.209f, 2.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(2.0f, 4.791f, 3.791f, 3.0f, 6.0f, 3.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(12.588f, 7.399f)
                curveTo(12.367f, 6.867f, 11.633f, 6.867f, 11.412f, 7.399f)
                lineTo(11.095f, 8.163f)
                curveTo(10.555f, 9.467f, 9.548f, 10.508f, 8.281f, 11.071f)
                lineTo(7.385f, 11.47f)
                curveTo(6.872f, 11.698f, 6.872f, 12.446f, 7.385f, 12.674f)
                lineTo(8.335f, 13.096f)
                curveTo(9.57f, 13.645f, 10.559f, 14.649f, 11.108f, 15.909f)
                lineTo(11.416f, 16.616f)
                curveTo(11.642f, 17.134f, 12.358f, 17.134f, 12.584f, 16.616f)
                lineTo(12.892f, 15.909f)
                curveTo(13.441f, 14.649f, 14.431f, 13.645f, 15.665f, 13.096f)
                lineTo(16.615f, 12.674f)
                curveTo(17.128f, 12.446f, 17.128f, 11.698f, 16.615f, 11.47f)
                lineTo(15.719f, 11.071f)
                curveTo(14.452f, 10.508f, 13.444f, 9.467f, 12.904f, 8.163f)
                lineTo(12.588f, 7.399f)
                close()
            }
        }
        .build()
        return _aiGenerate2Fill!!
    }

private var _aiGenerate2Fill: ImageVector? = null
