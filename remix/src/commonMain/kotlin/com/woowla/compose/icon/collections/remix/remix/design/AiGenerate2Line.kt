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

public val DesignGroup.AiGenerate2Line: ImageVector
    get() {
        if (_aiGenerate2Line != null) {
            return _aiGenerate2Line!!
        }
        _aiGenerate2Line = Builder(name = "AiGenerate2Line", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(6.0f, 5.0f)
                curveTo(4.895f, 5.0f, 4.0f, 5.895f, 4.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(4.0f, 18.105f, 4.895f, 19.0f, 6.0f, 19.0f)
                horizontalLineTo(18.0f)
                curveTo(19.105f, 19.0f, 20.0f, 18.105f, 20.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(20.0f, 5.895f, 19.105f, 5.0f, 18.0f, 5.0f)
                horizontalLineTo(6.0f)
                close()
                moveTo(11.412f, 7.399f)
                curveTo(11.633f, 6.867f, 12.367f, 6.867f, 12.588f, 7.399f)
                lineTo(12.904f, 8.163f)
                curveTo(13.444f, 9.467f, 14.452f, 10.508f, 15.719f, 11.071f)
                lineTo(16.615f, 11.47f)
                curveTo(17.128f, 11.698f, 17.128f, 12.446f, 16.615f, 12.674f)
                lineTo(15.665f, 13.096f)
                curveTo(14.431f, 13.645f, 13.441f, 14.649f, 12.892f, 15.909f)
                lineTo(12.584f, 16.616f)
                curveTo(12.358f, 17.134f, 11.642f, 17.134f, 11.416f, 16.616f)
                lineTo(11.108f, 15.909f)
                curveTo(10.559f, 14.649f, 9.57f, 13.645f, 8.335f, 13.096f)
                lineTo(7.385f, 12.674f)
                curveTo(6.872f, 12.446f, 6.872f, 11.698f, 7.385f, 11.47f)
                lineTo(8.281f, 11.071f)
                curveTo(9.548f, 10.508f, 10.555f, 9.467f, 11.095f, 8.163f)
                lineTo(11.412f, 7.399f)
                close()
            }
        }
        .build()
        return _aiGenerate2Line!!
    }

private var _aiGenerate2Line: ImageVector? = null
